package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab061_TSK_NumberIsPositiveORNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int numberEntered = sc.nextInt();

        if(numberEntered < 0){
            System.out.println("Number is negative.");
        } else if (numberEntered > 0 ) {
            System.out.println("Number is positive.");
        }else{
            System.out.println("Zero number.");
        }

        sc.close();

    }
}
