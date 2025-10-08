package ex_13_Constructor;

public class Lab131_TSK_FirstLetterOfEachWordInString {
    public static void main(String[] args) {

        //First Letter of Each Word in a String.
        String str = "This is a testing world. And testing is important.";
        String[] splitString = str.split(" ");

        System.out.println("Created Array : ");
        for(int i = 0 ; i <= splitString.length - 1 ; i++){
            System.out.println(splitString[i]);
        }

        System.out.println("First Letter Of Each Word : ");
        for(int i = 0 ; i <= splitString.length -1 ; i++){

            for(int j=0; j < 1 ; j++){

                System.out.println(splitString[i].charAt(j));

            }

        }

    }
}
