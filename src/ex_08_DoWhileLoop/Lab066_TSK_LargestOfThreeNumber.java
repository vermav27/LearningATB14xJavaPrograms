package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab066_TSK_LargestOfThreeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter No. 1 : ");
        int num1 = sc.nextInt();
        System.out.printf("Enter No. 2 : ");
        int num2 = sc.nextInt();
        System.out.printf("Enter No. 3 : ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("No. 1 is max");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("No. 2 is max");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("No. 3 is max");
        } else{
            System.out.println("Larger Number is appearing two or three times");
        }

        sc.close();

    }
}
