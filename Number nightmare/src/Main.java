public class Main {

    public static void main(String[] args) {

        //initialize the dictionary
        Ex1.Initializa();

        //get input from user
        String userInput = Ex1.getUserInput();

        //prints a message if the users input is invalid
        if(!Ex1.userInputValidator(userInput))
        {
            System.out.println("You entered an invalid number.");
        }

        //split the users input
        String[] numbersArr = Ex1.stringSplit(userInput);

        //reverse only the number
        String reverseStr = Ex1.reverseString(numbersArr);

        //base - string to int
        int base = Integer.parseInt(numbersArr[1]);

        double decimalInt = Ex1.num2Decimal(reverseStr, base);
        System.out.println(decimalInt);
    }
}