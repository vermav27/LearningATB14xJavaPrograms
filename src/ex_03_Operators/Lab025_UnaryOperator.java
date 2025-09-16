package ex_03_Operators;

public class Lab025_UnaryOperator {
    public static void main(String[] args) {
         int a = 10;
         a = -a; // here minus is a unary operator
        System.out.println("New value of a : " + a);

        int b = -10; // here minus is a unary operator
        int c = -5; // here minus is a unary operator
        int d = b + c;
        System.out.println("Value of d : " + d);

    }
}
