package ex_09_Functions;

import java.util.Scanner;

public class Lab106_FunctionExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter value of a : ");
        int a = 0;

        if(sc.hasNextInt()){
           a = sc.nextInt();
        }else {
            System.out.println("Not a valid input");
            System.exit(0);
        }

        System.out.printf("Enter value of b : ");
        int b = sc.nextInt();

        int resultSum = sum(a,b);
        int resultSub = sub(a,b);
        int resultMul = mul(a,b);
        int resultDiv = div(a,b);

        System.out.println("Sum Result : " + resultSum);
        System.out.println("Sub Result : " + resultSub);
        System.out.println("Mul Result : " + resultMul);
        System.out.println("Div Result : " + resultDiv);

    }

    public static int sum(int x , int y){
        return x+y;
    }

    public static int sub(int x , int y){
        return x - y;
    }

    public static int mul(int x , int y){
        return x * y;
    }

    public static int div(int x , int y){
        return x/y;
    }

}
