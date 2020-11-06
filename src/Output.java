//
// Example use of the Output class:
// Output.print("Hello World");
//
// int count = 5;
// Output.print("Number of values = " + i)
//

import java.io.PrintStream;

public class Output
{
    private static PrintStream out = System.out;

    public static void print(String s)
    {
        out.println(s);
    }

    public static void setOut(PrintStream out)
    {
        Output.out = out;
    }
}