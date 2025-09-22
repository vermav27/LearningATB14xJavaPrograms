package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab069_Grading {
    public static void main(String[] args) {
/*

     Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
        1. Take user input for marks (Use Scanner class).
        2. Check the validity of marks (ensure they are between 0 and 100).
        3. Use if-else-if conditions to determine the grade based on marks.
        4. Display the grade as output.
        5. Grading Criteria (Example)
            Marks Range Grade
            90 - 100   A+
            80 - 89     A
            70 - 79      B
            60 - 69     C
            50 - 59      D
            40 - 49      E
            Below 40   Fail
*/
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Marks : ");
        int marks = sc.nextInt();
        String grade = "Fail";

        if(marks > 100 || marks < 0){
            System.out.println("Invalid Marks. Exiting...");
            System.exit(0);
        }

        if(marks >= 90 && marks <= 100){
            grade = "A+";
        } else if (marks >= 80 && marks <= 89) {
            grade = "A";
        } else if (marks >= 70 && marks <= 79) {
            grade = "B";
        } else if (marks >= 60 && marks <= 69) {
            grade = "C";
        } else if (marks >= 50 && marks <= 59) {
            grade = "D";
        } else if (marks >= 40 && marks <= 49) {
            grade = "E";
        }else {
            grade = "Fail !";
        }

        System.out.printf("Final grade : %s",grade);
        sc.close();


    }
}
