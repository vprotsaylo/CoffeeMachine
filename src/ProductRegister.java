import java.util.Vector;

// class ProductRegister:
// Abstraction of the thing that holds all the products.
// Knows what products are available.
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