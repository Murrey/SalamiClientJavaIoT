package it.bway.salami.model;


    public class SalamiMasterChefInfoBuilder
    {
        private SalamiMasterChefInfo masterChefInfo;
        public SalamiMasterChefInfoBuilder()
        {
            masterChefInfo = new SalamiMasterChefInfo();
        }
        public SalamiMasterChefInfoBuilder withId(String id)
        {
            masterChefInfo.id = id;
            return this;
        }
        public SalamiMasterChefInfoBuilder withIp(String ip)
        {
            masterChefInfo.ip = ip;
            return this;
        }
        public SalamiMasterChefInfoBuilder withPort(String port)
        {
            masterChefInfo.port = port;
            return this;
        }
        public SalamiMasterChefInfoBuilder withStatus(String status)
        {
            masterChefInfo.status = status;
            return this;
        }
        public SalamiMasterChefInfoBuilder withStartTime(Object startTime)
        {
            masterChefInfo.startTime = startTime;
            return this;
        }
        public SalamiMasterChefInfoAdapter adaptTo()
        {
            SalamiMasterChefInfoAdapter masterChefInfoAdapter = new SalamiMasterChefInfoAdapter(masterChefInfo);
            return masterChefInfoAdapter;
        }
    }
