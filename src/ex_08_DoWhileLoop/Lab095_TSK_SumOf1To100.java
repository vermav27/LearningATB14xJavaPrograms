package ex_08_DoWhileLoop;

public class Lab095_TSK_SumOf1To100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0 ; i <= 100 ; i++){
            sum = sum + i;
        }
        System.out.println("Sum from 1 to 100 is : "+ sum);
    }
}
