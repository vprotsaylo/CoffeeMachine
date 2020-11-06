// class Product:
// Abstraction of the drink.
// Responsible for knowing its name and recipe (for now).
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

    public void makeDrink(DispenserRegister dispenserReg)
    {
        myRecipe.makeDrink(dispenserReg);
    }
}