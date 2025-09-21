package ex_06_Loops;

public class Lab053_ForLoop_UseOfBreak {
    public static void main(String[] args) {
        for(int i = 0 ; i <= 50 ; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
