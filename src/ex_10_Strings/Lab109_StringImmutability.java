package ex_10_Strings;

public class Lab109_StringImmutability {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        //Now here no 2 different strings are created. its only one string created and
        // the another variable is just pointing to that.

        System.out.println(s1 == s2); // It will be true because this is in SCP and pointing to one "Helo"
        System.out.println(s1 == s3); // It will be false because this is in object area.
        System.out.println(s3 == s4); // It will be false because this is in object area but both are different entities.

        // So in case of string we will use .equals
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));


    }
}
