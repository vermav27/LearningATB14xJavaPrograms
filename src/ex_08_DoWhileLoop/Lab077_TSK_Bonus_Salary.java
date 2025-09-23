package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab077_TSK_Bonus_Salary {
    public static void main(String[] args) {
        /*
        If experience < 1 year
        → No Bonus

        If experience is between 1 and 3 years (inclusive)
        → Bonus = 5% of Salary

        If experience is between 4 and 6 years (inclusive)
        → Bonus = 10% of Salary

        If experience > 6 years
        → Bonus = 15% of Salary
        */

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the salary : ");
        double salary = sc.nextDouble();

        System.out.printf("Enter year of experience : ");
        int experience = sc.nextInt();
        double bonus = 0;


        if(experience < 1){

            bonus = 0;

        } else if (experience >= 1 && experience <= 3) {

            bonus = 5;

        } else if (experience >= 4 && experience <= 6) {

            bonus = 10;

        } else if (experience > 6) {

            bonus = 15;

        }

        double bonusCal = (bonus/100) * salary;
        System.out.println("Calculated bonus : " + bonusCal);
        double newSalary = salary + bonusCal;
        System.out.println("New Salary : " + newSalary);

        sc.close();

    }
}
