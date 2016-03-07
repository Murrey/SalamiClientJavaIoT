package it.bway.salami.model;

public class SalamiMessageAdapter extends ModelAdapter
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
