﻿
package it.bway.salami.model;

public class SalamiActionAdapter extends SalamiAction
{
    private SalamiAction action;
    public SalamiActionAdapter(SalamiAction action)
    {
        this.action = action;
    }
    public String toJson()
    {
        return SalamiModelUtil.objectToJson(action);
    }
    public SalamiAction toObject()
    {
        return action;
    }
}

