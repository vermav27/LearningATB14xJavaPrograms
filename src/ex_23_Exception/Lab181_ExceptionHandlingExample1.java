package ex_23_Exception;

public class Lab181_ExceptionHandlingExample1 {
    public static void main(String[] args) {
        System.out.println("1");

        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Issue here");
            e.printStackTrace(); // gives the full detailed problem
        }

        // So here we handled the exception using try - catch block
        // In try we will put whatever will be the code we think can give exception
        // In catch block we will put what should be executed if the code throws exceptions

        System.out.println("2");
    }
}
