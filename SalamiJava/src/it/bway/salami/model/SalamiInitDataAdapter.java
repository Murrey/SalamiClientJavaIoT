package it.bway.salami.model;

public class SalamiInitDataAdapter extends ModelAdapter
{
    private SalamiInitData initData;
    public SalamiInitDataAdapter(SalamiInitData initData)
    {
        this.initData = initData;
    }
    public String toJson()
    {
        return SalamiModelUtil.objectToJson(initData);
    }
    public SalamiInitData toObject()
    {
        return initData;
    }
}
