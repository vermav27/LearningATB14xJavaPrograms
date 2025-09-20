package ex_03_Operators;

public class Lab030_TSK_EvenOddUsingTernaryOp {
    public static void main(String[] args) {

        //Check if the number is even or odd using ternary operator

        int num = 10;
        String result = ((num%2) == 0) ? "Number is even" : "Number is Odd" ;
        System.out.println(result);

    }
}
