
package it.bway.salami.model;

    public class SalamiIngredient
    {
        public int index = 0;
        public String name = "";
        public int code = 0;
        public String description = "";
        public int category = 0;
        public int behavior = 0;
        public int type = 0;
        public String inputPattern = "";
        public int address = 0;
        public String slice = "";
        public  boolean used = false;
        public  boolean pollable = false;
        public String ToString()
        {
            String result = "";
            result = "{index:" + this.index + ",";
            result = result + "name:" + this.name + ",";
            result = result + "code:" + this.code + ",";
            result = result + "description:" + this.description + ",";
            result = result + "category:" + this.category + ",";
            result = result + "behavior:" + this.behavior + ",";
            result = result + "type:" + this.type + ",";
            result = result + "input_pattern:" + this.inputPattern + ",";
            result = result + "address:" + this.address + ",";
            result = result + "slice:" + this.slice + ",";
            result = result + "pollable:" + this.pollable + ",";
            result = result + "used:" + this.used + "}";
            return result;
        }
    }
