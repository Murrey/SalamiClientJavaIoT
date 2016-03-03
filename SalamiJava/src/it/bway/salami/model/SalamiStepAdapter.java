package it.bway.salami.model;

public class SalamiStepAdapter extends ModelAdapter
{
    private SalamiStep step;
    public SalamiStepAdapter(SalamiStep step)
    {
        this.step = step;
    }
    public String toJson()
    {
        return SalamiModelUtil.objectToJson(step);
    }
    public SalamiStep toObject()
    {
        return step;
    }
}
