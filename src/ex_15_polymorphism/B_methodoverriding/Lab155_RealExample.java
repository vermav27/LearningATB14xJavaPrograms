package ex_15_polymorphism.B_methodoverriding;

public class Lab155_RealExample {
    public static void main(String[] args) {
        TC1 tc1 = new TC1();
        tc1.openBrowser();

        TC2 tc2 = new TC2();
        tc2.openBrowser();
    }
}

class CommonToAll{

    void openBrowser(){
        System.out.println("Open Browser in 5 sec.");
    }
}

class TC1 extends CommonToAll{
    void startTC(){
        openBrowser();
    }
}

class TC2 extends CommonToAll{

    @Override
    void openBrowser(){
        System.out.println("Open Browser in 2 sec.");
    }
}