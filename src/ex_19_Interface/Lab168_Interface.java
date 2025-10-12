package ex_19_Interface;

public class Lab168_Interface {

    public static void main(String[] args) {

        //Interface completes teh incomplete methods
        car1 c1 = new car1();
        c1.drive();


    }

}

interface Engine1{
    void startEngine();
    void stopEngine();

    //if you want to create a complete function in a interface. then you will have to use the keyword "default"
    //you cannot create concrete function in interface

    default void hello(){
        System.out.println("Let Go On Drive");
    }
}

class car1 implements Engine1{
    void applyBreaks(){
        System.out.println("Applying Breaks");
    }

    @Override
    public void startEngine() {
        System.out.println("Start Car");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Car");
    }

    void drive(){
        startEngine();
        applyBreaks();
        stopEngine();
    }
}
