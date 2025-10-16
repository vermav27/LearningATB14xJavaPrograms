package ex_24_Generics;

public class Lab191_Generics_MethodOverloadingProblem {
    public static void main(String[] args) {
        temp_sum(3,4);
        temp_sum("hello","world");
    }

    //So this is the case of method over loading

    static Integer temp_sum(int a,int b){
        System.out.println( a + b);
        return a + b;
    }

    static String temp_sum(String a,String b){
        System.out.println(a + b);
        return a + b;
    }

}
