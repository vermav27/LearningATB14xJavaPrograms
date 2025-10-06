package ex_12_Class;

public class Lab121_CallClass_1 {

    public static void main(String[] args) {

        Lab120_ClassMain_1 cm = new Lab120_ClassMain_1();
        // Above line loads the class in the class loader.
        cm.name = "Pradeep";
        cm.age = 45;
        cm.Address = "143 street";
        cm.gender = "Male";
        cm.Salary = 100000;
        cm.PhoneNum = 921255558;

        cm.speak();
        cm.sleep();
        cm.eat();

    }

}
