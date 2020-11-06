package javabits.CoffeeMachine;

/**
 * The main entry point of the application.
 */
public class CoffeeMain
{
    /**
     * CoffeeMachine main class. Runs the application.
     *
     * @param args Array of parameters passed to the application
     * via the command line (not used).
     */
    public static void main (String[] args)
    {
        CoffeeMachine cm = new CoffeeMachine();
        while (cm.doOneAction())
        {
            //just loop
        }
    }
}