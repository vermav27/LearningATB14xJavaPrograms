package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab063_TSK_MaxOfTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter No. 1 : ");
        int num1 = sc.nextInt();

        System.out.printf("Enter No. 2 : ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("No. 1 is max");
        } else if (num2 > num1) {
            System.out.println("No. 2 is max");
        }else{
            System.out.println("Same Number");
        }

    }
}
