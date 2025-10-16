package ex_24_Generics;

public class Lab192_Generics_Solution {
    public static void main(String[] args) {

        temp(45,56);
        temp("hello","World");
        temp(67,"king");
        temp(true,false);

    }

    //This concept is rarely used.

    static <T> T temp(T a,T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }
}
