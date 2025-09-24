package ex_08_DoWhileLoop;

public class Lab087_TSK_SumOf10NaturalNumber {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1 ; i<=10 ; i++){
            sum = sum + i;
        }

        System.out.println( "Sum of first 10 natural numbers : " + sum);
    }
}
