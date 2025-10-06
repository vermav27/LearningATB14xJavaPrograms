package ex_11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab116_ArrayUserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Number of Elements of array : ");
        int arrayNum = sc.nextInt();

        int[] numberArray = new int[arrayNum];

        for (int i = 0 ; i < arrayNum ; i++){
            System.out.printf("Enter value of element : %d --> ",i );
            numberArray[i] = sc.nextInt();
        }

        Arrays.sort(numberArray);

        for(int i : numberArray){
            System.out.println(i);
        }

    }
}
