
package it.bway.salami.model;

import java.util.List;

public class SalamiRecipeBuilder
    {
        private SalamiRecipe recipe;
        public SalamiRecipeBuilder()
        {
            recipe = new SalamiRecipe();
        }
        public SalamiRecipeBuilder withName(String name)
        {
            recipe.name = name;
            return this;
        }
        public SalamiRecipeBuilder withTimeframe(String timeframe)
        {
            recipe.timeFrame = timeframe;
            return this;
        }
        public SalamiRecipeBuilder withIngredients(List<SalamiIngredient> ingredients)
        {
            recipe.ingredients = ingredients;
            return this;
        }
        public SalamiRecipeBuilder withSteps(List<SalamiStep> steps)
        {
            recipe.steps = steps;
            return this;
        }
        public SalamiRecipeBuilder withLoaded(boolean loaded)
        {
            recipe.loaded = loaded;
            return this;
        }
        public SalamiRecipeBuilder withStepIndex(int stepIndex)
        {
            recipe.stepIndex = stepIndex;
            return this;
        }
        public SalamiRecipeAdapter adaptTo()
        {
            return new SalamiRecipeAdapter(recipe);
        }
    }
