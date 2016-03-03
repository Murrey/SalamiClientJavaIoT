package it.bway.salami.model;

import com.google.gson.Gson;

import it.bway.salami.SalamiConstants;

public class SalamiModelUtil
{
    public static final String NOT_PRESENT = "NOT_PRESENT";
	public static Object jsonToObject(String jsonMessage, Class<?> c)
    {
    	Gson gson = new Gson();
    	return c.cast(gson.fromJson(jsonMessage, c));
    }
    public static String objectToJson(Object objectMessage)
    {
    	Gson gson = new Gson();
        return gson.toJson(objectMessage);
    }
    public static int getActionCommand(int ingredientType)
    {
        if (ingredientType == SalamiConstants.GPIO_ACTION_TYPE)
        {
            return SalamiConstants.CMD_DO_GPIO_ACTION;
        }
        if (ingredientType == SalamiConstants.MESSAGE_ACTION_TYPE)
        {
            return SalamiConstants.CMD_DO_MESSAGE_ACTION;
        }
        return -1;
    }
}

