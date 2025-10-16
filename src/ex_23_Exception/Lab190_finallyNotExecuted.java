package ex_23_Exception;

public class Lab190_finallyNotExecuted {
    public static void main(String[] args) {

        try {
            int a = 10/10;
            System.out.println(a);
            System.exit(0); // finally will not execute here if system.exit is in try block.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hello Last !");
        }

    }
}
