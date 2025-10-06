package ex_13_Constructor;

public class Lab123_Consturctor {
    public static void main(String[] args) {
        //Constructor is a special method which get invoked automatically;
        //Used to initialize the data members of new objects.
        //Constructor have same name as class.
        //Constructor donot have any return type.
        //constructor called only once at object creation.

        /*
        * Constructor can be of 2 type :
        * default constructor
        * parameterized constructor
        * */


        baby b1 = new baby();

    }
}

class baby{
    String name;

    //default constructor
    baby(){
        System.out.println("I am called");
    }

    { // Instance initialization block

        System.out.println("I am also called when a class is loaded.");

    }
}