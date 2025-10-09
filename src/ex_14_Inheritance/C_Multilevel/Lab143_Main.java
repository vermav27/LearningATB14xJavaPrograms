package ex_14_Inheritance.C_Multilevel;

public class Lab143_Main {

    public static void main(String[] args) {

        Lab142_Son son = new Lab142_Son();
        System.out.println("Son has : ");
        son.home();

        /*
        * So here the scenario is Both grandfather , father , son have same function "Home"
        * and now if son calls the home functions. it will call the son's home on priority
        * but if son donot have home then it will look for home in father and if father donot have home it will
        * look for grandfather.
        * Means => it will first look for local the it will go upwards step by step
        * */
    }

}
