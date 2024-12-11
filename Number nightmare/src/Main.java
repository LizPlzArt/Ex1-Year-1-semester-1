public class Main {

    public static void main(String[] args) {

        //initialize the dictionaries
        Ex1.Initializa1();
        Ex1.Initializa2();

        //get input from user
        System.out.println("Any number and it's corresponding base from binary to hexadecimal");
        String userInput = Ex1.getUserInput();

        String[] numString = Ex1.stringSplit(userInput);
        int decimalInt = Ex1.number2Int(userInput);
        int baseInt = Ex1.base2Int(userInput);
        System.out.println(decimalInt + " in decimal ");

        //convert the given natural num to the given base
        String decimal2Base = Ex1.int2Number(decimalInt, baseInt);
        String reverseStr = Ex1.reverseString(decimal2Base);
        System.out.println(reverseStr + " in base " + baseInt);

        //check if the first answer equals to the second answer
        boolean equals = Ex1.equals(numString[0], reverseStr);
        System.out.println("First value equals to the second value:"+ equals);
    }
}