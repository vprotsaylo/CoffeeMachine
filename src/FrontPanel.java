package javabits.CoffeeMachine;

/**
 *  This class instructs the correct product to make the drink.
 *  It also instructs {@link CashBox} to return change.
 */
public class FrontPanel
{
    /**
     * Selects a type of drink to make.
     * @param choiceIndex Choice index:
     * (1 = Black Coffee, 2=Coffee w/Cream, 3=Coffee w/Sugar, 4=Coffee w/Sugar &amp; Cream, 5=Bouillon).
     * @param cashBox CashBox to use.
     * @param productReg ProductRegister to use.
     * @param dispenserReg DispenserRegister to use.
     */
    public void select(int choiceIndex, CashBox cashBox, ProductRegister productReg, DispenserRegister dispenserReg)
    {
        Product product;
        product = productReg.productFromIndex(choiceIndex);
        if (cashBox.haveYou(product.price()))
        {
            product.makeDrink(dispenserReg); //make product using the dispensers
            cashBox.deduct(product.price()); //deduct price
        }
        else
        {
            Output.print("\tFrontPanel: Insufficient funds!\n");
        }
    }
}