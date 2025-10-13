package ex_20_StaticKeyword;

public class Lab169_staticKeyword {

    public static void main(String[] args) {

        student s1 = new student(23);
        student s2 = new student(33);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(s1.course_Name);
        System.out.println(s2.course_Name);
        System.out.println(student.course_Name);
        //i can also access that using class name because that resides in the class loader
        //similarly we can create a static method.
        student.fee();

    }

}

class student{
    int age; //non static
    static String course_Name = "ATB";

    //static is a shared value between the variables
    //static keyword means it is common to all references

    public student(int age_c){
        this.age = age_c;
    }

    public static void fee(){
        System.out.println("5000");
    }
}