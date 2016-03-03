package it.bway.salami.kitchen;



import it.bway.salami.chef.SalamiAssistantChef;
import it.bway.salami.model.SalamiInitData;

public class IOTKitchen
{
    private SalamiInitData initData;
    private  boolean joined;
    private SalamiAssistantChef assistantChef;
    public IOTKitchen(SalamiInitData initData)
    {
        this.initData = initData;
        this.joined = false;
    }
    public void connect()
    {
    }
    public void updateIngredient(String command, String name, String value)
    {
    }
    public void disconnect()
    {
    }
}
