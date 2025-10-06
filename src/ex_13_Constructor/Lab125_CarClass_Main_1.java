package ex_13_Constructor;

public class Lab125_CarClass_Main_1 {
    public static void main(String[] args) {
        Lab124_CarClass_Constructor_1 tesla = new Lab124_CarClass_Constructor_1();
        tesla.name = "Tesla Model Y";
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        System.out.println("------");
        Lab124_CarClass_Constructor_1 nano = new Lab124_CarClass_Constructor_1();
        nano.name = "Tata Nano";
        nano.model = "Yellow";
        nano.year = 2012;
        System.out.println(nano.name);
        System.out.println(nano.model);
        System.out.println(nano.year);


    }
}
