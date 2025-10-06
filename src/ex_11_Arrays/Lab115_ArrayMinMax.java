package ex_11_Arrays;

import java.util.Arrays;

public class Lab115_ArrayMinMax {
    public static void main(String[] args) {

        int[] number = {47,48,49,45,464,557,51,7,9,63};

        //Find out max number ( Easiest Method ) using inbuilt function
        Arrays.sort(number);
        System.out.println(number[number.length-1]);

        // find out max using for loop
        int max = number[0];
        for(int i = 1 ; i <= number.length - 1 ; i++){

            if(number[i] > max){
                max = number[i];
            }

        }
        System.out.println("Max is : " + max);

    }
}
