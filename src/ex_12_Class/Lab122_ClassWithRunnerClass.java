package ex_12_Class;

public class Lab122_ClassWithRunnerClass {
//This is a runner class
    public static void main(String[] args) {
        //inside main function
        student s1 = new student();
        s1.name = "Prashant";
        s1.age = 15;

        student s2 = new student();
        s2.name = "Vikas";
        s2.age = 67;

        s1.sleep();
        s2.sleep();
    }

}

//Normal Class
class student{
    String name;
    int age;

    void sleep(){
        System.out.println(name);
        System.out.println(age);
    }
}

//We can also make class like this