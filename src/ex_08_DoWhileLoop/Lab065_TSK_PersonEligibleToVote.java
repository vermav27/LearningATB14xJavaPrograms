package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab065_TSK_PersonEligibleToVote {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter person age : ");
        int age = sc.nextInt();

        if(age <= 0 ){
            System.out.println("Invalid Age !");
            System.exit(0);
        }

        if(age> 18){
            System.out.println("Eligible for voting !");
        }else{
            System.out.println("Not Eligible for voting !");
        }

        sc.close();

    }
}
