package javabits.CoffeeMachine;

/**
 * Product class (abstraction of the drink), responsible for knowing its name, it's recipe and price.
 */
public class Product
{
    private final String myName;
    private final Recipe myRecipe;
    private final int myPrice;

    Product(String name, int price, Recipe recipe)
    {
        myName = name;
        myPrice = price;
        myRecipe = recipe;
    }

    public String name()
    {
        return myName;
    }

    public Recipe recipe()
    {
        return myRecipe;
    }

    public int price()
    {
        return myPrice;
    }

    /**
     * Makes drink chosen by user, according to the product recipe.
     *
     * @param dispenserReg dispenser register.
     */
    public void makeDrink(DispenserRegister dispenserReg)
    {
        myRecipe.makeDrink(dispenserReg);
    }
}