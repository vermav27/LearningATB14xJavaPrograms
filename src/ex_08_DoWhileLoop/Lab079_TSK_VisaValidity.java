package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab079_TSK_VisaValidity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter age : ");
        int age = sc.nextInt();

        System.out.printf("Enter visa status ( valid or invalid ) : ");
        String status = sc.next();

        int isValid = 0;

        if( age >= 18 && status.equals("valid")){
            isValid = 1;
        } else if ((age < 18 && age > 0) || status.equals("invalid")) {
            isValid = 0;
        }

        if(isValid ==0){
            System.out.println("Person can not travel.");
        } else if (isValid ==1) {
            System.out.println("Person can travel.");
        }

        sc.close();

    }
}
