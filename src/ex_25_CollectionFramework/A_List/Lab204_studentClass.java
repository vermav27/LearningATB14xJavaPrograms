package ex_25_CollectionFramework.A_List;

public class Lab204_studentClass {

    private String name;
    private int age;

    public Lab204_studentClass(String name_c, int age_c) {
        this.name = name_c;
        this.age = age_c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printDetails(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No. : "+ this.age);
    }

    public String toString(){
        return "Student{" + "name='" + name + "'," + "age='" + age + "'}" ;
    }


}
