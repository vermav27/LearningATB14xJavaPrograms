package ex_02_Literals;

public class Lab021_Literals {
    public static void main(String[] args) {

        //literals are the value

        int age = 45;
        //integral literal

        final float pi = 3.14f;
        //float literal

        char x = 'A';
        char y = '$';
        char z = ' '; //blank space is also a character or literal.

        //Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("This is a big game of testing" + new_line + "where everyone is talking" + tab_line + "about manual" + back_space + "testing and"+ carriage_return +"automation");

    }
}
