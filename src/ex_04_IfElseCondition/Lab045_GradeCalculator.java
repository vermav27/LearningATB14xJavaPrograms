package ex_04_IfElseCondition;

import java.util.Scanner;

public class Lab045_GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Marks : ");
        int marks = sc.nextInt();
        char grade = ' ';

        if(marks >= 90 && marks <=100){
            grade = 'A';
        } else if (marks >= 80 && marks <= 89) {
            grade = 'B';
        } else if (marks >= 70 && marks <= 79) {
            grade = 'C';
        }else {
            grade = 'F';
        }

        System.out.println("Grade is : " + grade);

        sc.close();


    }
}
