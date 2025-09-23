package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab080_TSK_NoDivisibleBy5and11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number to check if it is divisible by 5 and 11 : ");
        int number = sc.nextInt();

        if(number % 5 == 0 && number % 11 == 0){
            System.out.println("Number divisible by both 5 & 11");
        } else if (number % 5 == 0) {
            System.out.println("Number only divisible by 5");
        } else if (number % 11 == 0 ) {
            System.out.println("Number only divisible by 11");
        }else{
            System.out.println("Number is not divisible by any of the number");
        }

        sc.close();

    }
}
