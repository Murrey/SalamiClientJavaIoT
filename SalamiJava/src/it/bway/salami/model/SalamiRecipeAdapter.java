
package it.bway.salami.model;

public class SalamiRecipeAdapter
{
    private SalamiRecipe recipe;
    public SalamiRecipeAdapter(SalamiRecipe recipe)
    {
        this.recipe = recipe;
    }
    public String toJson()
    {
        return SalamiModelUtil.objectToJson(recipe);
    }
    public SalamiRecipe toObject()
    {
        return recipe;
    }
}