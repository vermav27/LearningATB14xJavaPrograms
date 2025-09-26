package ex_08_DoWhileLoop;

public class Lab101_TSK_PyramidPattern {
    public static void main(String[] args) {
        /*
            *
           ***
          *****
         *******
        *********
       */

        for(int i = 1 ; i <= 5 ; i++){

            for(int j = 5-i ; j > 0 ;j--){

                System.out.printf(" ");

            }

            for(int k = 1 ; k <= (2*i)-1; k++){
                System.out.printf("*");
            }

            System.out.print("\n");


        }

    }
}
