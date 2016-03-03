package it.bway.salami.model;

public class SalamiActionBuilder
{
    private SalamiAction salamiAction;
    public SalamiActionBuilder()
    {
        salamiAction = new SalamiAction();
    }
    public SalamiActionBuilder withName(String name)
    {
        salamiAction.name = name;
        return this;
    }
    public SalamiActionBuilder ofType(int type)
    {
        salamiAction.type = type;
        return this;
    }
    public SalamiActionBuilder withIngredientIndex(int ingredientIndex)
    {
        salamiAction.ingredientIndex = ingredientIndex;
        return this;
    }
    public SalamiActionBuilder withDataload(String dataload)
    {
        salamiAction.dataload = dataload;
        return this;
    }
    public SalamiActionAdapter adaptTo()
    {
        try {
			return (SalamiActionAdapter) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
    }
}
