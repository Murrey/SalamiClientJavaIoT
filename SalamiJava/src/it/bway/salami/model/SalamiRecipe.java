
package it.bway.salami.model;

import java.util.List;

public class SalamiRecipe
    {
        public String name;
        public String timeFrame;
        public List<SalamiIngredient> ingredients;
        public List<SalamiStep> steps;
        public  boolean loaded;
        public int stepIndex;
        public String ToString()
        {
            String result = "{name: " + this.name + ",";
            result = result + "timeframe: " + this.timeFrame + ",";
            result = result + "ingredients: " + this.ingredients + ",";
            result = result + "steps: " + this.steps + ",";
            result = result + "loaded: " + this.loaded + ",";
            result = result + "step_index: " + this.stepIndex + "}";
            return result;
        }
    }

