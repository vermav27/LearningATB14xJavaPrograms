package ex_11_Arrays;

public class Lab113_Array {
    public static void main(String[] args) {

        //Array is a collection of data which is of similar type.
        //Array is always a continuous memory.
        //Index always start from 0.

        //1st way to initialize :
        int[] marks = {51,45,20,48};

        //2nd Way :
        int[] matrix = new int[3];

        //String.length();
        //array.length;
        //Size of array is mandatory.

        //For Each Loop to access each element of array :
        // for ( dataType item : array ){
        //  code to execute
        // }
        //example :

        for(int i : marks) {
            System.out.println(i);
        }

    }
}
