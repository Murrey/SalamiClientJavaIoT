package it.bway.salami.communication;

import it.bway.salami.model.SalamiModelUtil;
import it.bway.salami.model.SalamiRecipe;

public class ResponseAdapter
    {
        private String response;
        public ResponseAdapter(String response)
        {
            this.response = response;
        }
        public SalamiRecipe toObject()
        {
            return (SalamiRecipe) SalamiModelUtil.jsonToObject(response,SalamiRecipe.class);
        }
    }

