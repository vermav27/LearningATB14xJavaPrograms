package ex_04_IfElseCondition;

import java.util.Scanner;

public class Lab046_TypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Side 1 : ");
        double side1 = sc.nextDouble();

        System.out.print("Enter Side 2 : ");
        double side2 = sc.nextDouble();

        System.out.print("Enter Side 3 : ");
        double side3 = sc.nextDouble();

        String type = "Nill";

        if(side1 == side2 && side2 == side3){
            type = "Equilateral";
        } else if ((side1 == side2 && side2 != side3) || (side1 == side3 && side3 != side2) || (side2 == side3 && side3 != side1) ) {
            type = "isosceles";
        } else if ((side1 != side2 && side2 != side3 && side1 != side3)) {
            type = "scalene";
        }

        System.out.printf("Triangle is %s",type);

        sc.close();

    }
}
