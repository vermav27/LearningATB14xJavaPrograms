package ex_18_Abstraction;

public class Lab167_CarEngineMain {
    public static void main(String[] args) {
        wagonR w1 = new wagonR();
        w1.drive();
    }
}

abstract class Engine{
    abstract void start();
    abstract void stop();
}

class wagonR extends Engine{
    @Override
    void start() {
        System.out.println("Start Engine");
    }

    @Override
    void stop() {
        System.out.println("Stop Engine");
    }

    void drive(){
        start();
        System.out.println("Driving");
        stop();
    }
}