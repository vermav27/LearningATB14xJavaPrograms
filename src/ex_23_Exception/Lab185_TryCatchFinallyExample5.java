package ex_23_Exception;

public class Lab185_TryCatchFinallyExample5 {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;

        try {
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        } finally {
            System.out.println("I will be always executed");
        }

        // So finally block will always be executed. even if program execution gets the exception or not

        System.out.println("EOP");
    }
}
