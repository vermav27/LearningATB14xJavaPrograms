package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab097_TSK_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number you want to calculate factorial : ");
        int num = sc.nextInt();
        int factorial = 1;

        for(int i = num ; i >= 1 ; i--){
            factorial = factorial * i;
        }

        System.out.println("Factorial is : " + factorial);

        sc.close();
    }
}
