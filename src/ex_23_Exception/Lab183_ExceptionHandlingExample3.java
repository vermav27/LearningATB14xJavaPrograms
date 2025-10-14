package ex_23_Exception;

public class Lab183_ExceptionHandlingExample3 {
    public static void main(String[] args) {
        int c = 0 ;
        int b = 0;

        // There can be multiple catch block with try
        // Here ArithmeticException is like very smalled bucket.
        // Then If exception is not caught at Arithmetic Exception
        // Then we have Exception which is like a bit larger bucket then before.
        // If still exception is not caught then we have the largest bucket Throwable

        try {
            b = 10/c;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("I am in Exception Catch");
        }catch (Throwable e) {
            System.out.println("I am in Throwable Catch");
        }



        System.out.println(b);
    }
}
