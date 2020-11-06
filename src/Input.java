package javabits.CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Reads data from the input using BufferedReader (System.in by default).
 *
 * The method {@link #setIn(Reader) setIn} can be used to set a custom input stream.
 *
 * Example use of the Input class:
 * <pre>
 * String s;
 * s = Input.readString();
 *
 * int count;
 * Output.print("Please enter number of values);
 * count = Input.readInt();
* </pre>
*/
public class Input
{
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public Input() {}

    /**
     * Read a string from the standard input.
     * @return a String value read from the standard input.
     */
    public static String readString()
    {
        String s;
        try
        {
            s = in.readLine();
            s = s.toUpperCase();
            return s;
        }
        catch (IOException e)
        {
            return "";
        }
    }

    /**
     * Read an int value from the standard input.
     * @return int value read from the standard input.
     */
    public static int readInt()
    {
        try
        {
            String s = in.readLine();
            if (s.length() > 0)
            {
                return Integer.parseInt(s);
            }
            else
            {
                return -1;
            }
        }
        catch (IOException e)
        {
            return -1;
        }
    }

    /**
     * Sets the input Reader.
     * @param reader {@link Reader} for input BufferedReader.
     */
    public static void setIn(Reader reader) {
        in = new BufferedReader(reader);
    }
}