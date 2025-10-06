package ex_10_Strings;

public class Lab112_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        // String Buffer and String builder are classes that provide mutable sequences of characters.
        // New String do not create on modification.
        // String Builder is not thread safe ( fast )
        // String Buffer is thread safe ( slow )

        // Lets suppose
        //StringBuilder sb = new StringBuilder("Vineet");
        //sb.concat is TASK 1
        //sb.trim is TASK 2
        //when they execute they will not do one after another they will be happening all together.

        // BUT

        //StringBuffer sb = new StringBuffer("Vineet");
        //sb.concat is TASK 1
        //sb.trim is TASK 2
        //when they execute they will excute one after another. That why its safe

        StringBuffer sbuffer = new StringBuffer("Vineet");
        sbuffer.append("Verma");
        System.out.println(sbuffer);
        sbuffer.reverse();
        System.out.println(sbuffer);


        StringBuilder sbuilder = new StringBuilder("Kunal");
        sbuilder.append("Verma");
        System.out.println(sbuilder);
        sbuilder.reverse();
        System.out.println(sbuilder);



    }
}
