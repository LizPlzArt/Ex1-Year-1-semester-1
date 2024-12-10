import java.util.Hashtable;
import java.util.Scanner;
import java.util.Dictionary;

public class Ex1 {

    //this function gets input from the user
    public static String getUserInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in the following format '<number><b><base>:");
        return scanner.nextLine();
    }

    //this function splits the string to number and base and returns an array of those values
    public static String[] stringSplit(String userInput)
    {
        return userInput.split("b+");
    }

    //reverse string
    public static String reverseString( String numberString)
    {
        StringBuilder numberStr = new StringBuilder(numberString);
        StringBuilder reverseStr = numberStr.reverse();
        String reverseString = reverseStr.toString();
        return reverseString;
    }

    //dictionary for letters to numbers
    public static Dictionary<String, Integer> letters= new Hashtable<>();

    //dictionary for numbers to letters
    public static Dictionary<Integer, String> numbers= new Hashtable<>();


    //these functions initialize the dictionaries, the typo in the functions name is intended
    public static void Initializa1()
    {
        letters.put("A", 10);
        letters.put("B", 11);
        letters.put("C", 12);
        letters.put("D", 13);
        letters.put("E", 14);
        letters.put("F", 15);
    }
    public static void Initializa2()
    {
        numbers.put(10,"A");
        numbers.put(11,"B");
        numbers.put(12,"C");
        numbers.put(13,"D");
        numbers.put(14,"E");
        numbers.put(15,"F");
    }

    //convert a string and a base to decimal representation int
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
                currentInt = Ex1.letters.get(currentChar);
            }
            if (currentInt >= base)
            {
                System.out.println("You entered an invalid number.");
                break;
            }

            double expo = Math.pow(base, i);
            decimalInt = decimalInt + currentInt*expo;
        }
        return decimalInt;
    }

    //convert the string given by the user to decimal representation int
    public static int number2Int(String userInput) {
        int ans;

        //validate user input
        if (!isNumber(userInput)) {
            ans = -1;
        } else {
            //split the users input
            String[] numbersArr = Ex1.stringSplit(userInput);

            //reverse only the number
            String numString = numbersArr[0];
            String reverseStr = Ex1.reverseString(numString);

            //base - string to int
            int base = Integer.parseInt(numbersArr[1]);

            //convert to decimal representation
            ans = (int) Ex1.num2Decimal(reverseStr, base);

        }
        return ans;
    }

    //checks if the users input is in valid format
    public static boolean isNumber(String userInput) {
        boolean ans = true;
        String regex = "^[0-9A-F]+b[0-9A-F]$";
        ans = userInput.matches(regex);

        return ans;
    }

    //convert a natural number to a given base
    public static String int2Number(int naturalNum, int base) {
        String decimalStr = "";
        while (naturalNum > 0) {
            int remainder = naturalNum % base;
            if (remainder > 9) {
                String letter = numbers.get(remainder);
                decimalStr = decimalStr + letter;
            } else {
                decimalStr = decimalStr + remainder;
            }
            naturalNum = naturalNum / base;
        }
        return decimalStr;

    }

    //checks if two string values are equal
    public static boolean equals(String n1, String n2)
    {
        boolean ans = n1.equals(n2);
        return ans;
    }


}