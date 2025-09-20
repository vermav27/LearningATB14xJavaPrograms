package ex_03_Operators;

public class Lab035_TSK_GradeCalculator {
    public static void main(String[] args) {


//        Write a program that calculates and displays the letter grade for a given numerical score
//        (e.g., A, B, C, D, or F) based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

        int number = 59;

        String Grade = (number >= 90 && number <= 100) ? "Grade A" : (number >= 80 && number < 90) ? "Grade B" : (number >= 70 && number <= 79) ? "Grade C" : (number >= 60 && number <= 69) ? "Grade D" : "Grade F";
        System.out.println(Grade);


    }
}
