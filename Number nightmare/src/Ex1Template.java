import java.util.Hashtable;
import java.util.Scanner;
import java.util.Dictionary;

public class Ex1Template {

    public static int number2Int(String userInput) {
        int ans = -1;

        //split the users input
        String[] numbersArr = Ex1.stringSplit(userInput);

        //reverse only the number
        String numString = numbersArr[0];
        String reverseStr = Ex1.reverseString(numString);

        //base - string to int
        int base = Integer.parseInt(numbersArr[1]);

        //convert to decimal representation
        ans = (int) Ex1.num2Decimal(reverseStr, base);


        return ans;
    }

    public static boolean isNumber(String userInput) {
        boolean ans = true;
        if(userInput.matches("b"))
        {
            String[] stringArr = Ex1.stringSplit(userInput);
            if(stringArr[0].matches("[G-Za-z]","[^0-16]"))
            {
                ans = false;
            }
            if(stringArr[1].matches("[2-16]"))
            {
                ans = false;
            }
        }
        ans = userInput.matches("^[G-Za-z]b[0-16]");
        return ans;
    }

}
