package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab075_TSK_LoanEligibility {
    public static void main(String[] args) {

        /*
        The program should take the following inputs and store them into variables:
        Age → int
        Salary → double (or float)
        Credit Score → int

        1. Age Validation
                Must be a positive integer.
                Minimum age = 18 years.
                Maximum age = 80 years.

        2. Salary Validation
                Must be a positive number.
                Minimum salary threshold = 30,000.

        3. Credit Score Validation
                Must be a positive integer.
                Minimum credit score = 650.
                Maximum credit score = 850.

        If all three conditions (Age , Salary , Credit Score ) are satisfied → Person is Eligible for Loan.
                Otherwise → Person is Not Eligible for Loan.
                */

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter age : ");
        int age = sc.nextInt();

        System.out.printf("Enter salary : ");
        double salary = sc.nextDouble();

        System.out.printf("Enter credit score : ");
        int creditScore = sc.nextInt();

        if(age <= 0 ){
            System.out.println("Invalid Age.");
            System.out.println("Person is not eligible for Loan.");
            System.exit(0);
        } else if (age < 18 || age > 80) {
            System.out.println("Age is not in limit.");
            System.out.println("Person is not eligible for Loan.");
            System.exit(0);
        } else if (salary <= 0) {
            System.out.println("Invalid Salary.");
            System.out.println("Person is not eligible for Loan.");
            System.exit(0);
        } else if (salary < 30000) {
            System.out.println("Salary below the threshhold");
            System.out.println("Person is not eligible for Loan.");
            System.exit(0);
        } else if (creditScore <= 0) {
            System.out.println("Invalid Credit Score.");
            System.out.println("Person is not eligible for Loan.");
            System.exit(0);
        } else if (creditScore < 650 || creditScore > 850) {
            System.out.println("Creditscore below or above the threshold.");
            System.out.println("Person is not eligible for Loan.");
            System.exit(0);
        }

        System.out.println("Person is Eligible for Loan.");
        sc.close();

    }
}
