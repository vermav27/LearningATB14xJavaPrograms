package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab096_TSK_TableOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number you want to print table : " );
        int num = sc.nextInt();

        for(int i = 1 ; i  <= 10 ; i++){
            System.out.println(num + " X " + i + " = " + (num * i));
        }

    }
}
