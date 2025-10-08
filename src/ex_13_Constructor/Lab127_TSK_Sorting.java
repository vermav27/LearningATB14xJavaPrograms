package ex_13_Constructor;

public class Lab127_TSK_Sorting {
    public static void main(String[] args) {

        /*
        Sort the array → int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        1,3,4,10,12,32,34,100
        */

        int[] num = {10,20,15,25,45,56,67,78,78,10,23,24,25,26};
        int numIndex = num.length - 1;

        for(int i = 0 ; i <= numIndex ; i++){

            for(int j = 0 ; j <= numIndex ; j++){

                if(num[j] > num[i]){
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }

            }

        }

        for(int k = 0 ; k <= numIndex ; k++){
            System.out.println(num[k]);
        }

    }
}
