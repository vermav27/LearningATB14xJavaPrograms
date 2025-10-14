package ex_23_Exception;

public class Lab184_ExceptionHandlingExample4 {
    public static void main(String[] args) {

        int a = 0;
        int c = 0;

        //Below we can have multiple type of exceptions and this is how w e handle multiple
        //exception handling

        try {
            c = 10/a;
            String s1 = null;
            s1.trim();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());;
        }

        System.out.println("End");


    }
}
