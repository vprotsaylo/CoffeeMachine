package javabits.CoffeeMachine;

/**
 * Cash box class, knows about money. Gives change.
 */
public class CashBox
{
    private int credit = 0;

    /**
     * Deposits money from user.
     *
     * @param amount Amount of money deposited by user.
     */
    public void deposit(int amount)
    {
        Output.print("\tCashBox: Depositing " + amount);
        credit = credit + amount;
        Output.print("\tYou now have " + credit + " credits\n");
    }

    /**
     * Returns the currently available credit (change) to the user.
     */
    public void returnCoins()
    {
        Output.print("\tCashBox: Returning " + credit + "\n");
        credit = 0;
    }

    /**
     * Checks if user has enough money.
     *
     * @param amount Amount of money user deposits.
     * @return Returns true if user has deposited "amount" or more money.
     */
    public boolean haveYou(int amount)
    {
        return (credit >= amount);
    }

    /**
     * Takes amount from the credit, deducts it from credit and returns the rest.
     * @param amount the amount to be deposited from credit.
     */
    public void deduct(int amount)
    {
        credit = credit - amount;
        returnCoins();
    }
}