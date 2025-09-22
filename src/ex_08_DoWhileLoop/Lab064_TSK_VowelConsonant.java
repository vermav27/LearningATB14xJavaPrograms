package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab064_TSK_VowelConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a character : ");
        char enteredCharacter = sc.next().charAt(0);

        if(enteredCharacter == 'a' || enteredCharacter == 'e' ||enteredCharacter == 'i' ||enteredCharacter == 'o' ||enteredCharacter == 'u' ||enteredCharacter == 'A' ||enteredCharacter == 'E' ||enteredCharacter == 'I' ||enteredCharacter == 'O' ||enteredCharacter == 'U'){
            System.out.println("Its a vowel");
        }else {
            System.out.println("Its a consonant");
        }

        sc.close();
    }
}
