package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab073_TSK_Palindrome {
    public static void main(String[] args) {

        //Program to check if a number is palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int originalNumber = sc.nextInt();
        int revNumber = 0;
        int num = originalNumber;

        while(num > 0){
            int lastDigit = num%10;
            revNumber = revNumber * 10 + lastDigit;
            num = num/10;
        }

        System.out.println("Reverse Number is : " + revNumber);

        if(originalNumber == revNumber){
            System.out.println("This is palindrome.");
        }else{
            System.out.println("This is not palindrome.");
        }


        sc.close();

    }
}
