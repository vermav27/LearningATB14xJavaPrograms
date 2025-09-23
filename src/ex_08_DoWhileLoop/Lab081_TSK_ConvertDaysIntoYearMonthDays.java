package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab081_TSK_ConvertDaysIntoYearMonthDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Number of Days : ");
        int days = sc.nextInt();

        int year = 0;
        int month = 0;
        int day = 0;

        if (days>=365){

            year = days/365;
            int noOfDaysLeftFromYear = days - (year * 365);

            if(days >= 30){

                month = noOfDaysLeftFromYear / 30;
                int noOfDays = noOfDaysLeftFromYear - (month * 30);
                System.out.printf( "%d Years, %d Month, %d Days", year,month,noOfDays);

            } else if (days < 30) {

                int noOfDays = noOfDaysLeftFromYear;
                System.out.printf( "%d Years, %d Month, %d Days", noOfDaysLeftFromYear,month, noOfDays);

            }
        }else if ( days < 365 ) {

            if(days >= 30){

                month = days / 30;
                int noOfDays = days - (month * 30);
                System.out.printf( "%d Years, %d Month, %d Days", year,month,noOfDays);

            } else if (days < 30) {

                int noOfDays = days;
                System.out.printf( "%d Years, %d Month, %d Days", year,month, noOfDays);

            }

        }

        sc.close();

    }
}
