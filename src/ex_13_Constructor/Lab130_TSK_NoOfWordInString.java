package ex_13_Constructor;

public class Lab130_TSK_NoOfWordInString {

    public static void main(String[] args) {

        //Count the Number of Words in a String.
        String str = "Hello Testing";
        int noOfWords = 0;
        int strLength = str.length();
        for(int i = 0 ; i <= strLength-1 ; i++){

            if(str.charAt(i) != ' '){
                noOfWords++;
            }

        }
        System.out.println("Number of words :  " + noOfWords);


    }

}

