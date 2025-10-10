package ex_15_polymorphism.A_methodoverloading;

public class Lab150_MathOperations {

    //method with the same name with different arguments is called method overloading
    int add(int a , int b, int c){
        return a + b + c;
    }

    int add(int a, int b){
        return a +b;
    }

    //When a class has same name multiple method but their parameters are different
    //so whenever that function is called automatically that function will be choosen
    // which suits their parameter passed. so based on arguments results will be different.

}
