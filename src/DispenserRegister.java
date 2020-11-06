package javabits.CoffeeMachine;

import java.util.Vector;

/**
 * A class which contains all the dispensers.
 * It knows which dispenser contains a given ingredient.
 */
public class DispenserRegister
{
    private final Vector<Dispenser> dispensers = new Vector<>();

    /**
     * Adds new Dispenser to the dispensers list.
     * @param dispenser Dispenser to add.
     */
    public void addDispenser(Dispenser dispenser)
    {
        dispensers.addElement(dispenser);
    }

    /**
     * Finds the {@link Dispenser} for a given {@link Ingredient}.
     * @param ingr An ingredient to search.
     * @return Dispenser which contains a given ingredient.
     */
    public Dispenser getDispenserOf(Ingredient ingr)
    {
        int index = 0;
		while (index < dispensers.size())
        {
        	Dispenser d = dispensers.elementAt(index);
			if (d.contains(ingr)) return d;
			index = index + 1;
        }
        return null;
    }
}