package ex_14_Inheritance.B_RealExample;

public class Lab137_TC1 extends Lab136_CommonToAll{
    void running_TC1(){
        startBrowser();
        connectingDatabase();
        System.out.println("Running TC 1");
        readingDatabase();
        closeBrowser();
    }
}
