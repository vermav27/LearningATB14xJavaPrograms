package ex_18_Abstraction;

public class Lab166_FatherChildMain {

    public static void main(String[] args) {

        child c1 = new child();
        c1.loan50k();
        c1.loan20k();

        //so here there is no visibility of the father. Directly child functions are called.
        //In which One of the function is in itself child and another one in abstracted in father class
        // Also , we cannot create object of father class because abstract class donot have any object.

    }

}

abstract class Father {

    abstract void loan50k();
    void loan20k(){
        System.out.println("This 20 K Loan is given.");
    }

}

class child extends Father {

    @Override
    void loan50k() {
        System.out.println("Son will pay father's 50k");
    }
}
