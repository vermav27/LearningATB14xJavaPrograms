package ex_15_polymorphism.B_methodoverriding;

public class Lab154_Main {
    public static void main(String[] args) {

        Lab153_Son so = new Lab153_Son();
        so.home();

        Lab152_Father f1 = new Lab152_Father();
        f1.home();

        Lab152_Father f2 = new Lab153_Son(); //concept of dynamic dispatch
        //when son is born father can be there
        //you can have child object with fathers reference

        f2.home(); //call will be done on the basis of created object. so here the new object is of son.
        //so the son's function is called. this is called over ridding

    }
}
