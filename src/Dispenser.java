package javabits.CoffeeMachine;

/**
 * Dispenser class
 * knows its ingredient, knows how to dispense a shot of the ingredient
 */
public class Dispenser
{
    private final Ingredient ingredient;
    private int shotsLeft;

    /**
     * Constructor function called when creating a new dispenser.
     * @param ingr {@link Ingredient}.
     * @param initilAmount Initial amount.
     */
    Dispenser(Ingredient ingr, int initilAmount)
    {
        ingredient = ingr;
        shotsLeft = initilAmount;
    }

    /** Dispenses one portion of the ingredient.
     * @return true if there was at least one shot of ingredient present in {@link Dispenser}.
     */
    public boolean dispense()
    {
        if (shotsLeft == 0)
        {
            Output.print("\tDispenser: out of " + ingredient.name());
            return false;
        }
        else
        {
            Output.print("\tDispensing " + ingredient.name());
            shotsLeft = shotsLeft - 1;
            return true;
        }
    }

    /**
     * Checks is ingredient is contained in this dispenser.
     * @param ingr {@link Ingredient} to add.
     * @return True if Ingredient is contained in this dispenser.
     */
    //
    public boolean contains(Ingredient ingr)
    {
        return ingr.equals(ingredient);
    }
}