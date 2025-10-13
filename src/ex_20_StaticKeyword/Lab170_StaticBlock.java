package ex_20_StaticKeyword;

public class Lab170_StaticBlock {

    public static void main(String[] args) {

        A a = new A();

        //So whenever a class get load static block inside a class get called itself once

    }

}

class A{
    static{
        System.out.println("Called SIB");
        System.out.println("Called only once when class is loaded");
    }

    static int a = 10;
    static void m1(){
        System.out.println("hello");
    }

}
