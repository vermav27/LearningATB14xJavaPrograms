package ex_23_Exception;

public class Lab178_Exception {
    public static void main(String[] args) {

        /*
        * An Exception is an event that occurs during the exception of a program that
        * disrupts the normal flow of instructions
        *
        * If exception not handled then control passes to the JVM and JVM terminates the program.
        *
        * */
        System.out.println("Start Program");
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 100 / a ;
        System.out.println(b);
        System.out.println("End Of Program");


        // java.lang.ArithmeticException --> When args[0] is 0
        // java.lang.NumberFormatException --> When args[0] is a string
        // java.lang.ArrayIndexOutOfBoundsException --> When no input in args[0]

        //Errors cannot be handled
        //Exception can be handled using Try catch block
        /*
        * Exception are of two type :
        * 1. Checked --> JVM knows it --> JVM will give you exception messages
        * 2. Unchecked --> JVM does not know it --> Compile Time
        * */

    }
}
