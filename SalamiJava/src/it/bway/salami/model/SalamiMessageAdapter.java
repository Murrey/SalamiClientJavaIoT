
package it.bway.salami.model;

    public class SalamiMessageAdapter
    {
        private SalamiMessage message;
        public SalamiMessageAdapter(SalamiMessage message)
        {
            this.message = message;
        }
        public String toJson()
        {
            return SalamiModelUtil.objectToJson(message);
        }
        public SalamiMessage toObject()
        {
            return message;
        }
    }
