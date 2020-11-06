package javabits.CoffeeMachine;

/**
 * Ingredient is just a string with the ingredient name.
 */
public class Ingredient
{
    private String myName;

    /** Constructor function called when object is created, e.g.
     * <pre>Ingredient i = new Ingredient("sugar"):</pre>
     * @param name Name of ingredient.
     */
    Ingredient(String name)
    {
        myName = name;
    }

    /**
     * Get the name for {@link Ingredient}.
     * @return the name of ingredient.
     */
    public String name()
    {
        return myName;
    }
}