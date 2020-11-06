package javabits.CoffeeMachine;//

import java.io.PrintStream;

/**
 * This class creates {@link PrintStream} (System.out by default).
 *
 */
public class Output
{
    private static PrintStream out = System.out;

    /**
     * Prints a string into output stream.
     * @param s String to print.
     */
    public static void print(String s)
    {
        out.println(s);
    }

    /**
     * Sets the output PrintStream.
     * @param out output stream.
     */
    public static void setOut(PrintStream out)
    {
        Output.out = out;
    }
}