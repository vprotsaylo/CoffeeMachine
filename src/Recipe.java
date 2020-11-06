package javabits.CoffeeMachine;

import java.util.Vector;

/**
 *  Recipe class, consists of an ingredients.
 */
public class Recipe
{
    private final Vector<Ingredient> ingredients = new Vector<>();

    /**
     * Creates a Recipe by adding the supplied ingredients.
     * @param i1 first ingredient.
     * @param i2 second ingredient.
     * @param i3 third ingredient.
     * @param i4 forth ingredient.
     * @param i5 fifth ingredient.
     */
    Recipe(Ingredient i1, Ingredient i2, Ingredient i3, Ingredient i4, Ingredient i5)
    {
        addIngredient(i1);
        addIngredient(i2);
        addIngredient(i3);
        addIngredient(i4);
        addIngredient(i5);
    }

    /**
     *  Adds ingredients to the {@link Recipe}.
     * @param ingr Ingredient to add to the recipe.
     */
    private void addIngredient(Ingredient ingr)
    {
        if (ingr != null) ingredients.addElement(ingr);
    }

    /**
     * Tells the dispensers to dispense ingredients in sequence.
     * @param dispenserReg dispenser register to use.
     */
    public void makeDrink(DispenserRegister dispenserReg)
    {
        int i = 0;
        while (i < ingredients.size())
        {
            Ingredient nextIngr = ingredients.elementAt(i);
            dispenserReg.getDispenserOf(nextIngr).dispense();
            i = i + 1;
        }
    }
}