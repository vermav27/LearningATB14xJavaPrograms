package ex_03_Operators;

public class Lab036_InpulFromCLI {
    public static void main(String[] args) {

        //This is what we do generally but values are hardcoded we want to use CLI for input.
        //So we will use "Edit Configurations" from above file dropdown ( IntelliJ )
        /*
        int a = 9;
        int b = 10;
        int result = a + b ;
        System.out.println(result);
        */
        String a_val = args[0];
        String b_val = args[1];

        int a = Integer.parseInt(a_val);
        int b = Integer.parseInt(b_val);
        int result = a + b;
        System.out.println(result);



    }
}
