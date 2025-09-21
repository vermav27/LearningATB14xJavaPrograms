package ex_05_SwitchStatement;

import java.util.Scanner;

public class Lab048_SwitchMultimatch_JDK13AdAbove {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product id to check the class :  ");
        int num = sc.nextInt();

        switch (num){
            case 1,3,5,7,9 :
                System.out.println("electronics");
                break;
            case 0,2,4,6,8,10:
                System.out.println("Plastics");
                break;
            default :
                System.out.println("JUNK IT IS !");
                break;
        }

        sc.close();
    }
}
