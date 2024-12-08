import java.util.Hashtable;
import java.util.Scanner;
import java.util.Dictionary;

public class Main {

    public static void main(String[] args) {

        Calculator.Initializa();
        String userInput = Calculator.getUserInput();
        if(!Calculator.userInputValidator(userInput))
        {
            System.out.println("You entered an invalid number.");
        }

        String[] numbersArr = Calculator.stringSplit(userInput);

        StringBuilder numberStr = new StringBuilder(numbersArr[0]);
        StringBuilder reverseStr = numberStr.reverse();

        int base = Integer.parseInt(numbersArr[1]);
        double decimalInt =0;

        for(int i=0; i<numberStr.length(); i++)
        {
            int currentInt;
            String currentChar = numberStr.substring(i,i+1);
            if (!currentChar.matches("[0-9]"))
            {
               currentInt = Calculator.dict.get(currentChar);
            }
            else
            {
                currentInt = Integer.parseInt(currentChar);
            }
            if (currentInt > base)
            {
                System.out.println("You entered an invalid number.");
                break;
            }

            double expo = Math.pow(base, i);
            decimalInt = decimalInt + currentInt*expo;
        }
      System.out.println(decimalInt);
    }
}