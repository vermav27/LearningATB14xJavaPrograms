package ex_23_Exception;

import java.util.Scanner;

public class Lab186_TryCatchFinallyExample6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("Closing scanner !");
        }


    }
}
