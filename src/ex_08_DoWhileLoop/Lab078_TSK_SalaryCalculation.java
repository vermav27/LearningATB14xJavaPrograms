package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab078_TSK_SalaryCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base salary : ");
        double baseSalary = sc.nextDouble();

        double HRA = ((double) 20 /100) * baseSalary;
        double DA = ((double) 10 /100) * baseSalary;
        double GrossSalary = baseSalary + HRA + DA;
        double TAX = ((double) 10 /100) * GrossSalary;
        double netSalary = GrossSalary - TAX;

        System.out.println("HRA : " + HRA);
        System.out.println("DA : " + DA);
        System.out.println("Gross Salary : " + GrossSalary);
        System.out.println("TAX : " + TAX);
        System.out.println("Net Salary : " + netSalary);

        sc.close();

    }
}
