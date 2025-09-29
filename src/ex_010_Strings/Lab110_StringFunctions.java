package ex_010_Strings;

public class Lab110_StringFunctions {
    public static void main(String[] args) {
        String name = "Vineet";

        System.out.println("Name length : " + name.length());

        System.out.println("Name character at 3  : " + name.charAt(3));

        System.out.println("Concatenated String is " + name.concat(" Verma"));

        System.out.println("Name contains ee ? : " + name.contains("ee"));

        System.out.println("Vineet equal kunal ? : " + name.equals("kunal"));

        System.out.println("Vineet equals VINEET ? : " + name.equalsIgnoreCase("VINEET"));

        System.out.println("Index of n in Vineet : " + name.indexOf('e')); // return the first occurance

        System.out.println("Replace n with N : " + name.replace('n','N'));

        String[] x =  name.split("n");
        System.out.println("1st Part : " + x[0]);
        System.out.println("2nd Part : " + x[1]);

        String newName = name.substring(0,3); // String you get will be from 0 index to 2 index
        System.out.println(newName);

        System.out.println("Name startes with V ? : " + name.startsWith("V"));
        System.out.println("Name startes with K ? : " + name.startsWith("K"));

        System.out.println("Trim name : " + name.trim());

        System.out.println("Compare name with VINEET : " + name.compareTo("VINEET")); //Check the content of string lexagraphically ( based on ASCII value ) ( case sensitive )
        System.out.println("Compare name with VINEET ( ignoring case ) : " + name.compareToIgnoreCase("VINEET")); //Check the content of string ( case sensitive )





    }

}
