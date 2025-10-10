package ex_16_Encapsulation.A_Encapsulation;

public class Lab157_LoginMain {
    public static void main(String[] args) {
        Lab156_Login login = new Lab156_Login("vverma","1234");
        System.out.println(login.Password);
        login.Password = "00000";

        // So here i am able to access the password which is not good
        // so we need to secure the password field and it should not get changed as well
        /*
        * means the variable username & password in the class should be secure . by default they are public in nature
        * means they can be accessed outside.
        * */
    }
}
