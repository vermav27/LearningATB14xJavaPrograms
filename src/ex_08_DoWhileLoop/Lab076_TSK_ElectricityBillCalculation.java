package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab076_TSK_ElectricityBillCalculation {
    public static void main(String[] args) {
/*
        Electricity Bill Calculation (Based on Units Consumed)
           :- take the input from the user of Units.
                Implement Rate Structure:
                Define the rate structure for calculating the bill based on the number of units consumed.
            :-  First 100 units: 0.50Rs per unit
        :-  Next 100 units (101-200): 0.75Rs per unit
        :- Next 100 units (201-300): 1.20Rs per unit
        :- Above 300 units: 1.50Rs per unit
        */

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter meter reading in units to calculate bill : ");
        int units = sc.nextInt();
        double bill = 0;
        double billOfFirst100 = 100 * .50;
        double billOfSecond100 = 100 * .75;
        double billOfThird100 = 100 * 1.20;


        if(units <= 100){

            bill = units * .50;

        } else if (units >= 101 && units <= 200) {

            int unit_Afterfirst100 = units - 100;
            double billOfLeftUnits = unit_Afterfirst100 * 0.75;
            bill = billOfFirst100 + billOfLeftUnits;

        } else if (units >= 201 && units <= 300) {

            int unit_Afterfirst200 = units - 200;
            double billOfLeftUnits = unit_Afterfirst200 * 1.20;
            bill = billOfFirst100 + billOfSecond100 + billOfLeftUnits;

        } else if ( units > 300) {

            int unit_Afterfirst300 = units - 300;
            double billOfLeftUnits = unit_Afterfirst300 * 1.50;
            bill = billOfFirst100 + billOfSecond100 + billOfThird100 + billOfLeftUnits;

        }

        System.out.println("Total Bill : " + bill);
        sc.close();

    }
}
