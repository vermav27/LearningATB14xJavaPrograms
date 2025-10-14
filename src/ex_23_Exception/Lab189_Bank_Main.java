package ex_23_Exception;

public class Lab189_Bank_Main {
    public static void main(String[] args) {

        Lab188_Bank_Class sbi = new Lab188_Bank_Class("INR",1000);
        Lab188_Bank_Class icici = new Lab188_Bank_Class("INR",1500);
        int result = sbi.add(icici);
        System.out.println(result);

        Lab188_Bank_Class jp = new Lab188_Bank_Class("USD",1600);
        int result2 = sbi.add(jp);
        System.out.println(result2);



    }
}
