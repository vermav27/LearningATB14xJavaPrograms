package ex_08_DoWhileLoop;

public class Lab099_TSK_RightAngleTriangle {
    public static void main(String[] args) {
        /* Print a right angle triangle
        *
        * *
        * * *
        * * * *
        * * * * *
        */
        for(int i = 1 ; i <= 5 ; i++){

            for (int j = 1 ; j <= i ;j++){

                System.out.printf("*");

            }
            System.out.printf("\n");
        }

    }
}
