package ex_04_IfElseCondition;

import java.util.Scanner;

public class Lab043_IfElse_EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Number : ");
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.println("Number is even.");
        }else {
            System.out.println("Number is Odd.");
        }

        sc.close();
    }
}
