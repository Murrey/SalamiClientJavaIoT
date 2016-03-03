package it.bway.salami.model;


    public class SalamiIngredientBuilder
    {
        private SalamiIngredient ingredient;
        public SalamiIngredientBuilder()
        {
            ingredient = new SalamiIngredient();
        }
        public SalamiIngredientBuilder withIndex(int index)
        {
            ingredient.index = index;
            return this;
        }
        public SalamiIngredientBuilder withName(String name)
        {
            ingredient.name = name;
            return this;
        }
        public SalamiIngredientBuilder withCode(int code)
        {
            ingredient.code = code;
            return this;
        }
        public SalamiIngredientBuilder withDescription(String description)
        {
            ingredient.description = description;
            return this;
        }
        public SalamiIngredientBuilder withCategory(int category)
        {
            ingredient.category = category;
            return this;
        }
        public SalamiIngredientBuilder withType(int type)
        {
            ingredient.type = type;
            return this;
        }
        public SalamiIngredientBuilder withInputPattern(String inputPattern)
        {
            ingredient.inputPattern = inputPattern;
            return this;
        }
        public SalamiIngredientBuilder withAddress(int address)
        {
            ingredient.address = address;
            return this;
        }
        public SalamiIngredientBuilder withSlice(String slice)
        {
            ingredient.slice = slice;
            return this;
        }
        public SalamiIngredientBuilder withUsed(boolean used)
        {
            ingredient.used = used;
            return this;
        }
        public SalamiIngredientBuilder withPollable(boolean pollable)
        {
            ingredient.pollable = pollable;
            return this;
        }
        public SalamiIngredientAdapter adaptTo()
        {
            return new SalamiIngredientAdapter(ingredient);
        }
    }
