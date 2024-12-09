public class Main {

    public static void main(String[] args) {

        //initialize the dictionaries
        Ex1.Initializa1();
        Ex1.Initializa2();

        //get input from user
        System.out.println("Any number and it's corresponding base from binary to hexadecimal");
        String userInput = Ex1.getUserInput();

        //prints a message if the users input is invalid
        if(!Ex1.userInputValidator(userInput))
        {
            System.out.println("You entered an invalid number.");
        }

        //split the users input
        String[] numbersArr = Ex1.stringSplit(userInput);

        //reverse only the number
        String numString = numbersArr[0];
        String reverseStr = Ex1.reverseString(numString);

        //base - string to int
        int base = Integer.parseInt(numbersArr[1]);

        //convert to decimal representation
        double decimalInt = Ex1.num2Decimal(reverseStr, base);
        System.out.println(numString + " in base " + base + " = " + decimalInt + " in decimal ");

        //get new input from user
        System.out.println("Natural number and goal base from binary to hexadecimal");
        userInput = Ex1.getUserInput();

        //split the users input
        numbersArr = Ex1.stringSplit(userInput);

        //base - string to int
        base = Integer.parseInt(numbersArr[1]);
        int naturalNum = Integer.parseInt(numbersArr[0]);

        String decimal2Base = Ex1.decimal2Base(naturalNum, base);
        reverseStr = Ex1.reverseString(decimal2Base);
        System.out.println(reverseStr + " in base " + base);

        //check if the first answer equals to the second answer
        boolean equals = Ex1.equals(numString, reverseStr);
        System.out.println("First value equals second value:"+ equals);
    }
}