package ex_08_DoWhileLoop;

import java.util.Scanner;

public class Lab059_TSK_CountVowelsConsonants {
    public static void main(String[] args) {

        //Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Word : ");
        String word = sc.next();
        String lowerWord = word.toLowerCase();

        int lengthOfString = word.length();
        int noOfVowels = 0;
        int noOfConsonants = 0;

        for(int i = 0 ; i <= lengthOfString - 1 ; i++){
            if(lowerWord.charAt(i) == 'a' || lowerWord.charAt(i) == 'e' || lowerWord.charAt(i) == 'i' || lowerWord.charAt(i) == 'o' || lowerWord.charAt(i) == 'u' ){
                noOfVowels++;
            }else{
                noOfConsonants++;
            }
        }

        System.out.println("No of Vowels : " + noOfVowels);
        System.out.println("No of Consonants : " + noOfConsonants);


        sc.close();

    }
}
