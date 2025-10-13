package ex_22_wrapperClass;

public class Lab176_WrapperBoxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a; //This is boxing means int will automatically can convert to Integer --> Autoboxing
        System.out.println(b); //here b will have multiple funtions to work on. like b.<list of functions>

        Integer a2 = 42;
        int v = a2; // This is Unboxing
        System.out.println(v);
    }
}
