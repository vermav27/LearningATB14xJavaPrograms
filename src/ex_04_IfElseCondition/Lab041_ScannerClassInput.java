package ex_04_IfElseCondition;

import java.util.Scanner;

public class Lab041_ScannerClassInput {
    public static void main(String[] args) {

        //This is how we take input from user
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Number is : " + num);
    }
}
