package it.bway.salami.model;

import java.util.List;

public class SalamiStep
{
    public String crontab;
    public int sleep;
    public List<Object> conditions;
    public List<SalamiAction> actions;

    public String ToString()
    {
        String result = "{ crontab: " + this.crontab + ",";
        result = result + "sleep: " + this.sleep + ",";
        result = result + "conditions: " + this.conditions + ",";
        result = result + "actions: " + this.actions + "}";
        return result;
    }
    }