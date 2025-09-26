package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab098_TSK_FactorialWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number you want to calculate factorial using while loop : ");
        int num = sc.nextInt();
        int factorial = 1;
        while(num >= 1 ){
            factorial = factorial * num;
            num--;
        }

        System.out.println("Factorial is : " + factorial);

        sc.close();

    }
}
