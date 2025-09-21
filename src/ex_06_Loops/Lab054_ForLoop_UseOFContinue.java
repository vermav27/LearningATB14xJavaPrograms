package ex_06_Loops;

public class Lab054_ForLoop_UseOFContinue {
    public static void main(String[] args) {

        //in the continue statement loop will break at that point and then start the loop again with next value
        //so in this case as i == 10 , loop break and it didnt printed 10 and continues to next iteration of loop

        for(int i = 0 ; i <= 50 ; i++){
            if(i == 10){
                continue;
            }
            System.out.println(i);
        }
    }
}
