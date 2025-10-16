package ex_23_Exception;

import java.io.FileInputStream;

public class Lab187_ThrowsExample7 {
    public static void main(String[] args) throws Exception {

        // we can use any type of exception handling try - catch or throws keyword
        // which is associated with main function
        FileInputStream file = new FileInputStream("C://log.txt");
        // Throws handles checked exceptions
        // Throw handles both checked and unchecked exception


    }
}
