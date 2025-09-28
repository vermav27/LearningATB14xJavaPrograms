package ex_09_Functions;

public class Lab105_UserDefinedFunction {
    public static void main(String[] args) {
        /*
        4 type of functions
        1. Without Parameters and without Return Type.
        2. Without Parameters and with Return Type.
        3. With Parameters and without Return Type.
        4. With Parameters and with Return Type.

        Return Type :
        1. void : It donot return anything
        2. returntype : It can be anything : int, long , double, array

        */

        main(); // This is calling
        greet(); // Without Parameters and without Return Type.
        String s = greetWithHello(); // Without Parameters and with Return Type.
        woah(43,43); //With Parameters and without Return Type.
        int x = testing(45,12); //With Parameters and with Return Type.
        System.out.println(x);

    }

    //This is declaration
    static void main(){
        System.out.println("Look a like of main.");
    }


    static void greet(){
        System.out.println("Hello");
    }


    static String greetWithHello(){
        return "Hellow World";
    }

    static void woah(int a , int b){
        System.out.println(a+b);
    }

    static int testing(int a , int b){
        return a+b;
    }

}
