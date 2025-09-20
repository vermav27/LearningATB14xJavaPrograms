package ex_03_Operators;

public class Lab037_IncrementDecrementOperator {
    public static void main(String[] args) {
        //Increment Decrement Operator

        // Prefix Increment : ++variable
        // Postfix Increment : variable++

        //Pre Increment = ++a == value is incremented first and then stored in result.
        //Post Increment = a++ = Value is stored first and then incremented.

        int a = 10;
        a = a++;
        System.out.println("Value of a : " + a); // Value should be 10
        a = ++a;
        System.out.println("Value of a : " + a); // Value should be 11




    }
}
