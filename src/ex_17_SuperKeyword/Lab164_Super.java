package ex_17_SuperKeyword;

public class Lab164_Super {

    public static void main(String[] args) {

        TC1 t1 = new TC1("Chrome");
        t1.openBrowser();
        System.out.println("Starting TC1");
        t1.closeBrowser("Chrome");
        System.out.println(t1.getBrowser());

    }

}

class baseClass{

    private String browser;

    //Constructor

    baseClass(String br){
        this.browser = br;
    }

    //Getter setter in class

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin){

            this.browser = browser;

        }else {
            System.out.println("Change browser not allowed");
        }
    }

    //Functions in class

    void openBrowser(){
        System.out.println("Open Browser !");
    }

    void openBrowser(String browser){
        System.out.println("Open Browser --> " + browser);
    }

    void closeBrowser(String browser){
        System.out.println("Close Browser");
    }

}

class TC1 extends baseClass{

    public TC1(String br) {
        super(br);
        //here super keyword calls the constructor of the base class.
        //super can also access the function of parent function , variable using super keyword
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        System.out.println("Over ride the parent set browser");
    }
}
