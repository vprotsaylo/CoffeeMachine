package javabits.CoffeeMachine;

import java.util.Vector;

/**
 * This class holds all the products.
 * It knows what products are available.
 */
public class ProductRegister
{
    private final Vector<Product> products = new Vector<>();

    public Product productFromIndex(int index)
    {
        return products.elementAt(index-1);
    }

    public void addProduct(Product p)
    {
        products.addElement(p);
    }
}