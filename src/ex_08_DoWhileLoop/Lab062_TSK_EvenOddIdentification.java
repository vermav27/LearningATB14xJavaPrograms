package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab062_TSK_EvenOddIdentification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int numberEntered = sc.nextInt();

        if(numberEntered%2 == 0){
            System.out.println( "Even Number" );
        }else{
            System.out.println( "Odd number ");
        }

        sc.close();

    }
}
