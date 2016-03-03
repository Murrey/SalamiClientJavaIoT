
package it.bway.salami.model;
    public class SalamiMessage
    {
        public int source;
        public String destination;
        public int ingredient;
        public int command;
        public String commandData;
        public int timestamp;
        public int expiration;
        public String ToString()
        {
            String result = "{source:" + this.source + ",";
            result = result + "destination:" + this.destination + ",";
            result = result + "ingredient:" + this.ingredient + ",";
            result = result + "command:" + this.command + ",";
            result = result + "command_data:" + this.commandData + ",";
            result = result + "expiration:" + this.expiration + ",";
            result = result + "timestamp:" + this.timestamp + "}";
            return result;
        }
    
	    public SalamiMessage SalamiMessageCallback(String message) {
			return null;
		}
	}
