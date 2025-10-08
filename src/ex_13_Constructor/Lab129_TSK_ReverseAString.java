package ex_13_Constructor;

public class Lab129_TSK_ReverseAString {
    public static void main(String[] args) {

        //Write a program to reverse a string without using inbuilt functions.
        String str = "Hello World !";
        String revStr = "";
        int strLen = str.length();

        for(int i = strLen-1 ; i >= 0 ; i--){
            revStr = revStr + str.charAt(i);
        }

        System.out.println("Reversed String : " + revStr);

    }
}
