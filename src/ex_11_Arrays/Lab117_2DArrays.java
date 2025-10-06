package ex_11_Arrays;

public class Lab117_2DArrays {
    public static void main(String[] args) {
        int[][] myNums = {{2,3,6},{4,7,8},{9,2,3}};

        //  2  3  6
        //  4  7  8
        //  9  2  3

        for(int i = 0; i < myNums.length ; i ++){

            for (int j = 0 ; j < myNums[i].length ; j++){

                System.out.println(myNums[i][j]);

            }

        }

    }
}
