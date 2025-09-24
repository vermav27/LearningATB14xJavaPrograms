package ex_08_DoWhileLoop;

public class Lab092_TSK_SumOf10NaturalNumber_While {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;
        while(i <= 10){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum : " + sum);

    }
}
