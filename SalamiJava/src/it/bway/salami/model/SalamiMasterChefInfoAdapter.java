﻿package it.bway.salami.model;

public class SalamiMasterChefInfoAdapter extends ModelAdapter
{
    private SalamiMasterChefInfo masterChefInfo;
    public SalamiMasterChefInfoAdapter(SalamiMasterChefInfo masterChefInfo)
    {
        this.masterChefInfo = masterChefInfo;
    }
    public String toJson()
    {
        return SalamiModelUtil.objectToJson(masterChefInfo);
    }
    public SalamiMasterChefInfo toObject()
    {
        return masterChefInfo;
    }
}
