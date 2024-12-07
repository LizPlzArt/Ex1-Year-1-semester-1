import java.util.Scanner;
public class NumberNightmare {
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
        return userInput.matches("[0-9A-Ga-g]+b+[0-9]");
    }

    //a function that splits the string to number and base and returns an array of those values
    public static String[] stringSplit(String userInput)
    {
        return userInput.split("b+");
    }

    //a function that converts the number given by the user to decimal representation
    public static int convert2Decimal(int number, int base)
    {

        return Integer.parseInt(num);
    }

    public static void main(String[] args) {

        String userInput = getUserInput();
        if(!userInputValidator(userInput))
        {
            System.out.println("You entered an invalid number.");
        }

        String[] numbers = stringSplit(userInput);
        int number = Integer.parseInt(numbers[0]);
        int base = Integer.parseInt(numbers[1]);



    }
}