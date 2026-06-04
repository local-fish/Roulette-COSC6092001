package util;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


/**
 * Provides variety of methods to simplify getting user input from console.
 * 
 * @author Robert C. Duvall
 */
public class ConsoleReader {
    private static Scanner in = new Scanner(new InputStreamReader(System.in));

    public static int promptInt (String prompt)
    {
        System.out.print(prompt);
        return in.nextInt();
    }

    public static String promptString (String prompt)
    {
        System.out.print(prompt);
        return in.next();
    }


    public static int promptRange (String prompt, int low, int hi)
    {
        int answer;
        do
        {
            answer = promptInt(prompt + " between " + low + " and " + hi + "? ");
        }
        while (low > answer || answer > hi);
        return answer;
    }
}
