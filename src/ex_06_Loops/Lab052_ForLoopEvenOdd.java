package ex_06_Loops;

public class Lab052_ForLoopEvenOdd {
    public static void main(String[] args) {
        for(int i = 0;i<=50 ; i++){

            if(i%2 == 0){
                System.out.println("Even Number -> " + i);
            }else{
                System.out.println("Odd Number -> " + i);
            }

        }
    }
}
