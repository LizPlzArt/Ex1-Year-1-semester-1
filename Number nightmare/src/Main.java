public class Main {

    public static void main(String[] args) {

        //initialize the dictionaries
        Ex1.Initializa1();
        Ex1.Initializa2();

        //get input from user
        System.out.println("Any number and it's corresponding base from binary to hexadecimal");
        String userInput = Ex1.getUserInput();

        int decimalInt = Ex1.number2Int(userInput);
        String[] numArr = Ex1.stringSplit(userInput);
        String numString = numArr[0];
        System.out.println(decimalInt + " in decimal ");


        //get new input from user
        System.out.println("Natural number and goal base from binary to hexadecimal");
        userInput = Ex1.getUserInput();

        //split the users input
        String[] numbersArr = Ex1.stringSplit(userInput);

        //base - string to int
        int base = Integer.parseInt(numbersArr[1]);
        int naturalNum = Integer.parseInt(numbersArr[0]);

        //convert the given natural num to the given base
        String decimal2Base = Ex1.int2Number(naturalNum, base);
        String reverseStr = Ex1.reverseString(decimal2Base);
        System.out.println(reverseStr + " in base " + base);

        //check if the first answer equals to the second answer
        boolean equals = Ex1.equals(numString, reverseStr);
        System.out.println("First value equals second value:"+ equals);
    }
}