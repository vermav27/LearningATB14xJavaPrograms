package ex_03_Operators;

public class Lab031_TSK_MaxOf3Num {
    public static void main(String[] args) {

        //Program to find out the maximum of three number
        int num1 = 30;
        int num2 = 20;
        int num3 = 45;

        int maxNum = num1 > num2 && num1 > num3 ? num1 : ( num2 > num3 && num2 > num1 ? num2 : num3 );
        System.out.println("Maximum number is : " + maxNum);

    }
}
