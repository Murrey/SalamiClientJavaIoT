
package it.bway.salami.model;

import it.bway.salami.Callback;

public class SalamiInitDataBuilder
    {
        private SalamiInitData initData;
        public SalamiInitDataBuilder()
        {
            initData = new SalamiInitData();
        }
        public SalamiInitDataBuilder withToiUrl(String toiUrl)
        {
            initData.toiUrl = toiUrl;
            return this;
        }
        public SalamiInitDataBuilder withSocketUrl(String socketUrl)
        {
            initData.socketUrl = socketUrl;
            return this;
        }
        public SalamiInitDataBuilder withSliceSlot(int sliceSlot)
        {
            initData.sliceSlot = sliceSlot;
            return this;
        }
        public SalamiInitDataBuilder withMessageCallback(Callback callback)
        {
            initData.messageCallback = callback;
            return this;
        }
        public SalamiInitDataAdapter adaptTo()
        {
            SalamiInitDataAdapter dataAdapter = new SalamiInitDataAdapter(initData);
            return dataAdapter;
        }
    }
