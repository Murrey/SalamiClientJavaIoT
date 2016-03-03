
package it.bway.salami.model;


    public class SalamiMessageBuilder
    {
        private SalamiMessage message;
        public SalamiMessageBuilder()
        {
            this.message = new SalamiMessage();
        }
        public SalamiMessageBuilder withSource(int source)
        {
            message.source = source;
            return this;
        }
        public SalamiMessageBuilder withDestination(String destination)
        {
            message.destination = destination;
            return this;
        }
        public SalamiMessageBuilder withIngredient(int ingredient)
        {
            message.ingredient = ingredient;
            return this;
        }
        public SalamiMessageBuilder withCommand(int command)
        {
            message.command = command;
            return this;
        }
        public SalamiMessageBuilder withCommandData(String commandData)
        {
            message.commandData = commandData;
            return this;
        }
        public SalamiMessageBuilder withTimestamp(int timestamp)
        {
            message.timestamp = timestamp;
            return this;
        }
        public SalamiMessageBuilder withExpiration(int expiration)
        {
            message.expiration = expiration;
            return this;
        }
        public SalamiMessageAdapter adaptTo()
        {
            SalamiMessageAdapter messageAdapter = new SalamiMessageAdapter(message);
            return messageAdapter;
        }
    }
