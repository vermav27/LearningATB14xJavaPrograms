package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab083_TSK_SeniorCitizen {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the age : ");
        int age = sc.nextInt();

        if(age<0){
            System.out.println("Invalid Age.");
            System.exit(0);
        } else if (age >= 0 && age<=12 )  {
            System.out.println("Child");
        }else if (age >= 13 && age<= 19 )  {
            System.out.println("Teenager");
        }else if (age >= 20 && age<=64 )  {
            System.out.println("Adult");
        }else {
            System.out.println("Sr. Citizen");
        }

        sc.close();


    }
}
