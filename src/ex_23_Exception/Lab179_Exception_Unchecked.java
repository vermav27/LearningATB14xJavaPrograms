package ex_23_Exception;

public class Lab179_Exception_Unchecked {
    public static void main(String[] args) {
        /*
        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);
        */

        //java.lang.ArithmeticException --> Whenever JVM doesnot know the
        // exception then than is called unchecked exception

        String name = null;
        name.trim(); //JVM also doesnot know about this.
        //java.lang.NullPointerException --> Unchecked
    }
}
