package ex_23_Exception;

import java.io.FileInputStream;

public class Lab180_Exception_Checked {
    public static void main(String[] args) {
        //Checked --> JVM knows about it.

        //UNCOMMENT THE BELOW LINE ONLY
        //FileInputStream file = new FileInputStream("C://log.txt");


        //There can be a possibility that JVM donot find this file. Which JVM did before the compilation
        //So JVM telling it to handle it.

        //We can handle the exception using Try Catch Block or Throws

        //What we can perform :
        //Try and Catch
        //Try and Multiple Catch
        //Throws vs Throw
        //Custom Exceptions

        /*
        * Program Execution in case of exception :
        * 1. JVM will be initialized ( from RAM )
        * 2. Create and start main thread.
        * 3. Collect the command line arguments.
        * 4. Now control will be transferred from main thread to main method.
        * 5. When any problem comes in main then JVM take the control.
        * 6. And if now Exception is not handled then JVM always terminate the program.
        * */

    }
}
