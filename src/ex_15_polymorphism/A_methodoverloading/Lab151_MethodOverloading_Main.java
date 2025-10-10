package ex_15_polymorphism.A_methodoverloading;

public class Lab151_MethodOverloading_Main {
    public static void main(String[] args) {
        Lab150_MathOperations mo = new Lab150_MathOperations();
        int result = mo.add(4,5,6);
        int result2 = mo.add(8,9);

        System.out.println("Result of 2 variable : "+ result2);
        System.out.println("Result of 3 variable : "+ result);
    }
}
