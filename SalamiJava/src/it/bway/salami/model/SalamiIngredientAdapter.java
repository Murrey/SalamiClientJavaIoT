package it.bway.salami.model;

public class SalamiIngredientAdapter extends ModelAdapter
{
    private SalamiIngredient ingredient;
    public SalamiIngredientAdapter(SalamiIngredient ingredient)
    {
        this.ingredient = ingredient;
    }
    public String toJson()
    {
        return SalamiModelUtil.objectToJson(ingredient);
    }
    public SalamiIngredient toObject()
    {
        return ingredient;
    }
}
