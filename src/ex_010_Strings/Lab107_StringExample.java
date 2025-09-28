package ex_010_Strings;

public class Lab107_StringExample {
    public static void main(String[] args) {

        String s1 = "Hello"; // This is in String contant Pool SCP.
        s1 = s1.concat("_World");
        System.out.println(s1);

        //Strings are immutable.
        //When we create a string it never destroied, it just point to another string.
        //Like s1 = "Hello"
        //Now s1 = "World"
        //It means "Hello" is stil in the SCP Pool. but now s1 is now pointing to "World"

        String s3 = new String("Vineet"); //This is in the heap area


    }
}
