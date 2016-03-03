package it.bway.salami.model;


public class SalamiModelUtil
{
    public static final String NOT_PRESENT = "NOT_PRESENT";
    public static Object jsonToObject(String jsonMessage)
    {
    	return null;
//        return JsonConvert.DeserializeObject<Type>(jsonMessage);
    }
    public static <?>String objectToJson(Object objectMessage)
    {
    	return objectMessage.getClass();
    }
//    {
//        return JsonConvert.SerializeObject(objectMessage);
//    }
//    public static int getActionCommand(int ingredientType)
//    {
//        if (ingredientType == SalamiConstants.GPIO_ACTION_TYPE)
//        {
//            return SalamiConstants.CMD_DO_GPIO_ACTION;
//        }
//        if (ingredientType == SalamiConstants.MESSAGE_ACTION_TYPE)
//        {
//            return SalamiConstants.CMD_DO_MESSAGE_ACTION;
//        }
//        return -1;
//    }
}

