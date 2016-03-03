package it.bway.salami.slice;

import it.bway.salami.kitchen.IOTKitchen;
import it.bway.salami.model.SalamiInitData;
import it.bway.salami.model.SalamiInitDataBuilder;

public abstract class ABSSlice
    {
        private int sliceSlot;
        private SalamiPassport passport;
        private IOTKitchen iot;

        public ABSSlice(int sliceSlot)
        {
            passport = new SalamiPassport();
            this.sliceSlot = sliceSlot;
        }

        public void activate()
        {
            SalamiInitData initData = new SalamiInitDataBuilder()
                .withSliceSlot(this.sliceSlot)
                .withToiUrl(this.passport.toiUrl)
                .withSocketUrl(this.passport.socketUrl)
                .withMessageCallback(null)//(this.onMessage)
                .adaptTo().toObject();
            this.iot = new IOTKitchen(initData);
            try
            {
                this.iot.connect();
            } catch(Exception e)
            {
                
                this.iot.disconnect();
            }
        }
        public void deactivate()
        {
            this.iot.disconnect();
        }
        public abstract void onMessage(String message);
        public abstract void sendIngredientUpdate();//controlla parametro
    }
