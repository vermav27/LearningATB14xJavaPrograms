package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab074_TSK_ArmstrongNumber {
    public static void main(String[] args) {
        //Check if a Number is an Armstrong Number

        //User input of number.
        //count number of digits = power.
        //calculate the sum of all digits with power.
        //compare the results

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number : ");
        int originalNumber = sc.nextInt();
        int forCalculatingPower_number = originalNumber;
        int forCalculatingTotal_number = originalNumber;
        int numberOfDigits = 0;
        int total = 0;


        while(forCalculatingPower_number>0){
            forCalculatingPower_number = forCalculatingPower_number / 10;
            numberOfDigits++;
        }

        int power = numberOfDigits;

        //calculating total
        while(forCalculatingTotal_number != 0 ){
            int lastNum = forCalculatingTotal_number % 10;
            total = total + (int)Math.pow(lastNum,power);
            forCalculatingTotal_number = forCalculatingTotal_number/10;

        }

        //checking if number is armstrong number or not
        if(total == originalNumber){
            System.out.println("This is armstrong number");
        }else{
            System.out.println("This is not armstrong number");
        }

        sc.close();

    }
}
