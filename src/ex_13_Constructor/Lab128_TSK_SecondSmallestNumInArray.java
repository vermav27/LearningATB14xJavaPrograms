package ex_13_Constructor;

import java.util.Scanner;

public class Lab128_TSK_SecondSmallestNumInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter length of array : ");
        int lengthOfArray = sc.nextInt();

        int[] num = new int[lengthOfArray];

        //input of array from user
        for(int i = 0 ; i <= lengthOfArray-1 ; i++){
            System.out.printf("Enter element at index %d --> ",i);
            num[i] = sc.nextInt();
        }

        //created array
        for(int i = 0 ; i <= lengthOfArray-1 ; i++){
            System.out.println(num[i]);
        }

        //sorting
        for(int i = 0;i <= lengthOfArray-1;i++){

            for(int j = 0;j <= lengthOfArray-1;j++){

                if(num[j] > num[i]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }

            }

        }

        //Sorted Array
        System.out.println("Sorted Array : ");
        for(int i = 0 ; i <= lengthOfArray-1 ; i++){
            System.out.println(num[i]);
        }

        //Second Smallest Number :
        System.out.println("Second smallest Num : " + num[1]);


    }
}
