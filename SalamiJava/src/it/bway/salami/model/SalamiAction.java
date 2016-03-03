package it.bway.salami.model;

import it.bway.salami.SalamiConstants;
import it.bway.salami.Exception.NotImplementedException;


    public class SalamiAction
    {
        public static final String GPIO_HOLD_FIELD = "HOLD";
        public static final String GPIO_WAIT_FIELD = "WAIT";
        public static final String GPIO_REPEAT_FIELD = "REPEAT";

        public String name = "";
        public int type = 0;
        public int ingredientIndex = 0;
        //private IDictionary<String, String> dataload = new Dictionary<String, String>(); Sostituire dataload
        public String dataload;

        public String ToString()
        {
            String result = "{ name: " + this.name + ",";
            result += "{type: " + this.type + ",";
            result += "{ingredient_index: " + this.ingredientIndex + ",";
            result += "{dataload: " + this.dataload + "}";
            return result;
        }

        public  boolean isMessageAction() throws NotImplementedException
        {
            //return this.type == SalamiConstants.MESSAGE_ACTION_TYPE;
            throw new NotImplementedException();
        }

        public  boolean isGpioAction() throws NotImplementedException
        {
            // return this.type == SalamiConstants.GPIO_ACTION_TYPE;
            throw new NotImplementedException();
        }

        public Object getDataLoadField(Object field) throws NotImplementedException
        {
            throw new NotImplementedException();
        }

        public Object getRepeat() throws NotImplementedException
        {
            //Sostituire la Stringa con il campo in salami constants
            if (this.type == SalamiConstants.GPIO_ACTION_TYPE)
            {
                return this.getDataLoadField(GPIO_REPEAT_FIELD);
            }
            else
                return null;
        }

        public Object getHold() throws NotImplementedException
        {
            if (this.type == SalamiConstants.GPIO_ACTION_TYPE)
            {
                return this.getDataLoadField(GPIO_WAIT_FIELD);
            }
            else
                return null;
        }

        public Object getWait() throws NotImplementedException
        {
            if (this.type == SalamiConstants.GPIO_ACTION_TYPE)
            {
                return this.getDataLoadField(GPIO_WAIT_FIELD);
            }
            else
                return null;
        }
    }
