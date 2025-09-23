package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab070_TSK_CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number to check if a number is prime or not : ");
        int number = sc.nextInt();
        int primeFlag = 0;
        if( number == 1 ){
            System.out.println("Prime number start from 2");
            System.exit(0);
        }

        for(int i = 2 ; i < number ; i++){
            if(number%i == 0){
                primeFlag = 1;
                break;
            }else{
                primeFlag = 0;
            }
        }

        if (primeFlag == 0){
            System.out.println("Its a  prime number.");
        } else if (primeFlag == 1) {
            System.out.println("Not a prime number");

        }

        sc.close();
    }
}
