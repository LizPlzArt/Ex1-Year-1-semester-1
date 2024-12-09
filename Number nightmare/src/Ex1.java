import java.util.Hashtable;
import java.util.Scanner;
import java.util.Dictionary;


public class Ex1 {

    //dictionary for letters to numbers
    public static Dictionary<String, Integer> dict= new Hashtable<>();

    //this function initializes the dictionary, the typo in the functions name is intended
    public static void Initializa()
    {
    dict.put("A", 10);
    dict.put("B", 11);
    dict.put("C", 12);
    dict.put("D", 13);
    dict.put("E", 14);
    dict.put("F", 15);
    }

    //this function gets input from the user
    public static String getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in the following format '<number><b><base>:");
        return scanner.nextLine();
    }

    //this function checks if the users input is in valid number format
    public static boolean userInputValidator(String userInput)
    {
        return userInput.matches("^[G-Za-z]b[0-16]");
    }

    //this function splits the string to number and base and returns an array of those values
    public static String[] stringSplit(String userInput)
    {
        return userInput.split("b+");
    }

    //reverse string
    public static String reverseString( String[] numbersArr)
    {
        StringBuilder numberStr = new StringBuilder(numbersArr[0]);
        StringBuilder reverseStr = numberStr.reverse();
        String reverseString = reverseStr.toString();
        return reverseString;
    }
    public static double num2Decimal(String numberStr, int base)
    {
        double decimalInt =0;
        for(int i=0; i<numberStr.length(); i++)
        {
            int currentInt;
            String currentChar = numberStr.substring(i,i+1);
            if (currentChar.matches("[0-9]"))
            {
                currentInt = Integer.parseInt(currentChar);
            }
            else
            {
                currentInt = Ex1.dict.get(currentChar);
            }
            if (currentInt > base)
            {
                System.out.println("You entered an invalid number.");
                break;
            }

            double expo = Math.pow(base, i);
            decimalInt = decimalInt + currentInt*expo;
        }
        return decimalInt;
    }

}
