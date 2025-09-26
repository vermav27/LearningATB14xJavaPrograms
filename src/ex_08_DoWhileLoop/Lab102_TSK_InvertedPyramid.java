package ex_08_DoWhileLoop;

public class Lab102_TSK_InvertedPyramid {
    public static void main(String[] args) {
        /*
        Print inverted pyramid
        *********
         *******
          *****
           ***
            *
        */
        for(int i = 0 ; i <= 5 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.printf(" ");
            }

            for (int k = 0; k < (2 * (5 - i) - 1) ; k++){

                System.out.printf("*");

            }

            System.out.printf("\n");
        }
    }
}
