package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab068_TSK_LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Year : ");
        int year = sc.nextInt();

        if(year%100 == 0 ){

            if(year%400 == 0){
                System.out.println("Its a leap year.");
            }else {
                System.out.println("Its not a leap year.");
            }

        } else if (year%4 == 0) {
            System.out.println("Its a leap year");
        } else {
            System.out.println("Its not a leap year");
        }

        sc.close();

    }
}
