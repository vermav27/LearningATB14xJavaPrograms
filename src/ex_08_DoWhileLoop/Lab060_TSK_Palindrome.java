package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab060_TSK_Palindrome {
    public static void main(String[] args) {

        //Write a program to reverse a string and check if the word is palindrome or not

        //input from user
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a word : ");
        String enteredWord = sc.next();

        //calculating word length
        int lengthOfString = enteredWord.length();
        String wordAfterReverse = "";

        //reversing word
        for(int i = lengthOfString - 1 ; i >= 0 ; i--){
            wordAfterReverse = wordAfterReverse + enteredWord.charAt(i);
        }
        System.out.println("Reverse word : " + wordAfterReverse);

        //checking if a word is palindrome
        if(enteredWord.equals(wordAfterReverse)){
            System.out.printf("Word %s is a palindrome. \n",enteredWord);
        }else {
            System.out.printf("Word %s is not a palindrome. \n",enteredWord);
        }

        sc.close();

    }
}
