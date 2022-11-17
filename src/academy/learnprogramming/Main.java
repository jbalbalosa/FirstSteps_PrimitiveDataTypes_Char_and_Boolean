package academy.learnprogramming;

public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Primitive Data Types: Char and Boolean");


        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("myChar: " + myChar);
        System.out.println("myUnicodeChar: " + myUnicodeChar);

        char myCopy = '\u00A9';
        System.out.println(myCopy);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean isCustomerOverTwentyOne = true;

        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
        System.out.println(isCustomerOverTwentyOne);

    }
}