package it.bway.salami.model;

import it.bway.salami.Callback;

public class SalamiInitData
{
    public String toiUrl = "";
    public int sliceSlot;
    public String socketUrl = "";
    public Callback messageCallback;
    public String ToString()
    {
        String result = "";
        result += "{ toi_url: " + this.toiUrl + ",";
        result = result + "slice_id: " + this.sliceSlot + ",";
        //result = result + this.messageCallback + "}";
        return result;
    }
}
