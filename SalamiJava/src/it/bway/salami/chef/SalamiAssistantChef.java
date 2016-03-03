using SalamiClient.communication;
using SalamiClient.model;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

package it.bway.salami.chef

import java.util.ArrayList;
import java.util.List;

import it.bway.salami.Callback;
import it.bway.salami.SalamiConstants;
import it.bway.salami.communication.SalamiHttpClient;
import it.bway.salami.communication.SalamiSubscriber;
import it.bway.salami.model.SalamiIngredient;
import it.bway.salami.model.SalamiInitData;
import it.bway.salami.model.SalamiMasterChefInfo;
import it.bway.salami.model.SalamiMessage;
import it.bway.salami.model.SalamiMessageBuilder;
import it.bway.salami.model.SalamiRecipe;

public class SalamiAssistantChef
    {

        private Callback kitchenCallback;
        private int slot;
        private String toiUrl, socketUrl;
        private SalamiMasterChefInfo masterChefInfo;
        private SalamiSubscriber publisher, receiver, system;
        private List<SalamiIngredient> ingredients;
        private ChefWorker worker;

        public SalamiAssistantChef(SalamiInitData initData)
        {
            this.slot = initData.sliceSlot;
            this.masterChefInfo = new SalamiMasterChefInfo();
            this.toiUrl = initData.toiUrl;
            this.socketUrl = initData.socketUrl;
            this.kitchenCallback = initData.messageCallback;
            this.ingredients = new ArrayList<SalamiIngredient>();
        }

        private void joinKitchen(String socketUrl)
        {
            this.receiver = new SalamiSubscriber(socketUrl + "/downstream?id=" + this.slot, this.onDownstreamMessage);
            this.publisher = new SalamiSubscriber(socketUrl + "/upstream?id=" + this.slot, this.onUpstreamMessage);
            this.system = new SalamiSubscriber(socketUrl + "/system?id=ALL", this.onSystemMessage);
        }

        private SalamiRecipe retrieveRecipe(String toiUrl)
        {
            String recipeUrl = toiUrl + SalamiConstants.RECEIVER_URL;
            SalamiHttpClient httpClient = new SalamiHttpClient(recipeUrl);
            return httpClient.get().Result.toObject();
        }

        private void loadIngredients(SalamiRecipe recipe)
        {
            this.ingredients.clear();
            for(SalamiIngredient ingredient : recipe.ingredients)
            {
                if(ingredient.address == this.slot)
                {
                    if(ingredient.category == SalamiConstants.DATA_INGREDIENT_CLASS)
                    {
                        if(ingredient.behavior == SalamiConstants.DATA_BEHAVIOR_ON_REQUEST)
                        {
                            ingredient.pollable = true;
                        }
                    }
                    this.ingredients.add(ingredient);
                }
            }
        }

        private void sendStatusUpdate(String status)
        {
            String message = new SalamiMessageBuilder()
                .withSource(this.slot)
                .withDestination("ALL")
                .withIngredient(0)
                .withCommand(SalamiConstants.CMD_ADVERTISE_SLICE)
                .withCommandData("{\"id\":"+this.slot+", \"status\":"+status+"}")
                .adaptTo().toJson();
            this.system.publish(message);
        }

        public  boolean validateMessage(SalamiMessage message)
        {
            if((message.source.ToString() != this.slot.ToString())&&(message.destination == "ALL"))
            {
                return true;
            } else if(message.destination == this.slot.ToString())
            {
                return true;
            }
            return false;
        }

        public  boolean onReceive(String command)
        {
            if (command.contains(SalamiConstants.JOIN_KITCHEN))
            {
                this.joinKitchen(this.socketUrl);
                this.sendStatusUpdate("INITIALIZING");
                this.sendStatusUpdate("RETRIEVING RECIPE");
                SalamiRecipe recipe = this.retrieveRecipe(this.toiUrl);
                this.sendStatusUpdate("LOADING INGREDIENTS");
                this.loadIngredients(recipe);
                this.worker = new ChefWorker(this.ingredients);
                this.worker.setToSliceMessageCallback(this.onActionMessage);
                this.sendStatusUpdate("RUNNING");
                return true;
            }
            if (command.contains(SalamiConstants.UPDATE_INGREDIENT))
            {
                SalamiMessage message = command[SalamiConstants.UPDATE_INGREDIENT];
                //create SalamiCommand e sostuire String command con SalamiCommand command e fare le dovute sostituzioni
            }
            return false;
        }

        public void setKitchenCallback(Callback callback)
        {
            this.kitchenCallback = callback;
        }

        public void onDownstreamMessage(String message)
        {

        }
        public void onUpstreamMessage(String message)
        {

        }
        public void onSystemMessage(String message)
        {

        }
        public void onActionMessage(String message)
        {

        }
    }
