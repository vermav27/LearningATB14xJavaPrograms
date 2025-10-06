package ex_13_Constructor;

public class Lab124_CarClass_Constructor_1 {

    String name;
    int year;
    String model;

    //default constructor
    Lab124_CarClass_Constructor_1(){
        name = "Unknown Car";
        model = "XXX";
        year = 0;

        System.out.println("DC");
    }

}
