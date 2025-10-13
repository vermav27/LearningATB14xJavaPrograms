package ex_22_wrapperClass;

public class Lab177_Conversion {
    public static void main(String[] args) {
        String num = "10";
        //String to wrapper conversion
        Integer a = Integer.parseInt(num); //Wrapper String -> Wrapper Conversion

        //String to Primitive conversion
        int a3 = Integer.parseInt(num);

        Integer aa = Integer.valueOf("10");
        System.out.println(aa);

    }
}
