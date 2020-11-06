// knows its ingredient, knows how to dispense a shot of the ingredient
public class Dispenser
{
    private final Ingredient ingredient;
    private int shotsLeft;

    // constructor function called when creating a new dispenser:
    Dispenser(Ingredient ingr, int initilAmount)
    {
        ingredient = ingr;
        shotsLeft = initilAmount;
    }

    public boolean dispense()
    {
        // dispense one portion of the ingredient
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

    // returns the ingredient contained in this dispenser
    public boolean contains(Ingredient ingr)
    {
        return ingr.equals(ingredient);
    }
}