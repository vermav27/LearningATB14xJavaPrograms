package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab071_TSK_ATM_withdraw {
    public static void main(String[] args) {
/*

        Initialize the account balance with a fixed amount (e.g., ₹10,000).
        1. Take user input for the amount they want to withdraw.
        2. Check withdrawal conditions:
        3. The amount should be greater than zero.
        4. The amount should be a multiple of 100 (common ATM rule).
        5. The amount should not exceed the account balance.
        6. Deduct the amount from the balance if conditions are met.
        7. Display the updated balance or an error message if the withdrawal fails.

*/
        int Balance = 10000;
        int transactionSuccess = 0;

        System.out.println("Your current account balance is : INR " + Balance);
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter amount you want to withdraw : ");
        int amountToWithdraw = sc.nextInt();

        if(amountToWithdraw <= 0){
            System.out.println("Invalid Amount Entered");
            transactionSuccess = 0;
            System.out.println("Transaction Fail !");
            System.exit(0);
        } else if (amountToWithdraw % 100 != 0) {
            System.out.println("Amount is not a multiple of 100.");
            transactionSuccess = 0;
            System.out.println("Transaction Fail !");
            System.exit(0);
        } else if (amountToWithdraw > Balance ) {
            System.out.println("Amount entered is more than your account balance.");
            transactionSuccess = 0;
            System.out.println("Transaction Fail !");
            System.exit(0);
        }

        Balance = Balance - amountToWithdraw;
        System.out.println("Remaining Balance = INR " + Balance);
        transactionSuccess = 1;

        if(transactionSuccess == 1){
            System.out.println("Transaction Success !");
        }else {
            System.out.println("Transaction Fail !");
        }

        sc.close();

    }
}
