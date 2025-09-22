package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab070_CheckAlphabet {
    public static void main(String[] args) {
        //Check if a Character is an Alphabet.
        // ASCII value a to z --> 97 to 122
        // ASCII value A to Z --> 65 to 90

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the character : ");
        int enteredCharacter = sc.next().charAt(0);

        if(enteredCharacter >= 65 && enteredCharacter <=90 || enteredCharacter >= 97 && enteredCharacter <=122 ){
            System.out.println("This is an alphabet");
        }else{
            System.out.println("This is not alphabet.");
        }

        sc.close();

    }
}
