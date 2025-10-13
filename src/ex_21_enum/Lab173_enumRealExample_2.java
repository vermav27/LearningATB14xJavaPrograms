package ex_21_enum;

public class Lab173_enumRealExample_2 {
    public static void main(String[] args) {
        System.out.println(colors.RED.getHexCode());
    }
}

enum colors{
    RED("#fda1a1"),BLUE("#a1abfd"),GREEN("#a1fda2");

    //You need to remember this
    //you can use this for the locator in automation

    private String hexCode;
    colors(String hexCode){
        this.hexCode = hexCode;
    }

    String getHexCode(){
        return this.hexCode;
    }
}
