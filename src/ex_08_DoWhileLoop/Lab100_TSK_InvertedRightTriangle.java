package ex_08_DoWhileLoop;

public class Lab100_TSK_InvertedRightTriangle {

    public static void main(String[] args) {
        /*
        * * * * *
        * * * *
        * * *
        * *
        *
        */
        for(int i = 1 ; i <= 5; i++){

            for(int j = 5 ; j >= i ; j-- ){

                System.out.printf("*");

            }

            System.out.printf("\n");

        }

    }

}
