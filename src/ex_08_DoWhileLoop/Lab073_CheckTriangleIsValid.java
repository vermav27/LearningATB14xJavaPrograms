package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab073_CheckTriangleIsValid {
    public static void main(String[] args) {
        //Check if a Triangle is Valid Based on Three Sides.
        //Sum of two sides should be greater than 3rd side.

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Side A : ");
        float sideA = sc.nextFloat();

        System.out.printf("Enter Side B : ");
        float sideB = sc.nextFloat();

        System.out.printf("Enter Side C : ");
        float sideC = sc.nextFloat();

        if(((sideA + sideB) > sideC) && ((sideB + sideC) > sideA) && ((sideA + sideC)>sideB) ){
            System.out.println("This is a valid triangle");
        }else{
            System.out.println("This is not a valid triangle");
        }

        sc.close();

    }
}
