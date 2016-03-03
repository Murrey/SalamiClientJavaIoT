package it.bway.salami.chef;

import java.util.List;

import it.bway.salami.Callback;
import it.bway.salami.SalamiConstants;
import it.bway.salami.model.SalamiIngredient;
import it.bway.salami.model.SalamiMessage;
import it.bway.salami.model.SalamiActionBuilder;

public class ChefWorker
    {
        private List<SalamiIngredient> ingredients;
        private Callback toSliceMessageCallback;
        public ChefWorker(List<SalamiIngredient> ingredients)
        {
            this.ingredients = ingredients;
        }
        public void setToSliceMessageCallback(Callback callback)
        {
            this.toSliceMessageCallback = callback;
        }
        public void process(SalamiMessage message)
        {
            if((message.command == SalamiConstants.CMD_DO_GPIO_ACTION) || (message.command == SalamiConstants.CMD_DO_MESSAGE_ACTION))
            {
                SalamiActionBuilder builder = new SalamiActionBuilder();
                if(message.command == SalamiConstants.CMD_DO_GPIO_ACTION)
                {
                    builder.ofType(SalamiConstants.GPIO_ACTION_TYPE);
                }
                else
                {
                    builder.ofType(SalamiConstants.MESSAGE_ACTION_TYPE);
                }
                builder.withName(this.decodeIngredientName(message.ingredient))
                    .withDataload(message.commandData);
                String action = builder.adaptTo().toJson();
//                this.toSliceMessageCallback(action);
            }
        }
        public String decodeIngredientName(int ingredientId)
        {
            for(SalamiIngredient ingredient : ingredients)
            {
                if(ingredient.index == ingredientId)
                {
                    return ingredient.name;
                }
            }
            return "";
        }
    }
