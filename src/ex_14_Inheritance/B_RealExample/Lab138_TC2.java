package ex_14_Inheritance.B_RealExample;

public class Lab138_TC2 extends Lab136_CommonToAll{

    void running_TC2(){
        startBrowser();
        connectingDatabase();
        System.out.println("Running TC 1");
        readingDatabase();
        closeBrowser();
    }

}
