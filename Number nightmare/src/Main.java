import java.util.Hashtable;
import java.util.Scanner;
import java.util.Dictionary;

public class Main {
    //a function that gets input from the user
    public static String getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in the following format '<number><b><base>:");
        return scanner.nextLine();
    }

    //a function that checks if the users input is in valid number format, returns -1 if invalid
    public static boolean userInputValidator(String userInput)
    {
        return userInput.matches("[0-9A-F]+b+[0-9]");
    }

    //a function that splits the string to number and base and returns an array of those values
    public static String[] stringSplit(String userInput)
    {
        return userInput.split("b+");
    }

    public static void main(String[] args) {

        Dictionary<String, Integer> dict= new Hashtable<>();
        dict.put("A", 10);
        dict.put("B", 11);
        dict.put("C", 12);
        dict.put("D", 13);
        dict.put("E", 14);
        dict.put("F", 15);

        String userInput = getUserInput();
        if(!userInputValidator(userInput))
        {
            System.out.println("You entered an invalid number.");
        }

        String[] numbers = stringSplit(userInput);
        String number = numbers[0];
        int base = Integer.parseInt(numbers[1]);
        double decimalInt =0;

        for(int i=0; i<number.length(); i++)
        {
            int currentInt;
            String currentChar = number.substring(i,i+1);
            if (!currentChar.matches("[0-9]"))
            {
               currentInt = dict.get(currentChar);
            }
            else
            {
                currentInt = Integer.parseInt(currentChar);
            }
            double exponent = Math.pow(base, i);
            decimalInt = decimalInt + currentInt*exponent;
        }
      System.out.println(decimalInt);
    }
}