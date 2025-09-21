package ex_04_IfElseCondition;

import java.util.Scanner;

public class Lab044_If_ElseIf_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Number 1 : ");
        int number1 = sc.nextInt();

        System.out.printf("Enter Number 2 : ");
        int number2 = sc.nextInt();

        if(number1 > number2){
            System.out.println("Number 1 is larger.");
        } else if (number2 > number1) {
            System.out.println("Number 2 is larger.");
        } else{
            System.out.println("Both are equal.");
        }

        sc.close();


    }
}
