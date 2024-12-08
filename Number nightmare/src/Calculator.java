import java.util.Hashtable;
import java.util.Scanner;
import java.util.Dictionary;


public class Calculator {
    public static Dictionary<String, Integer> dict= new Hashtable<>();
public static void Initializa()
{
    dict.put("A", 10);
    dict.put("B", 11);
    dict.put("C", 12);
    dict.put("D", 13);
    dict.put("E", 14);
    dict.put("F", 15);
}

    public static String getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in the following format '<number><b><base>:");
        return scanner.nextLine();
    }

    //a function that checks if the users input is in valid number format, returns -1 if invalid
    public static boolean userInputValidator(String userInput)
    {
        return userInput.matches("^[G-Za-z]b[0-16]");
    }

    //a function that splits the string to number and base and returns an array of those values
    public static String[] stringSplit(String userInput)
    {
        return userInput.split("b+");
    }

}
