package ex_16_Encapsulation.A_Encapsulation;

public class Lab159_GoodLoginMain {
    public static void main(String[] args) {
        Lab158_GoodLogin login = new Lab158_GoodLogin("Vineet","pass000");

        // System.out.println(login.username); here user will not be able to access the username and password

        /*
        now if we take real life scenarion and user wants to change the username. then user
        cannot do it directly. user will have to use getter setter method to change that.
        how we will create the getter setter methods :
        right click inside the constructor and generate
        and choose the fields for which you want to create the getter setter.
        >> So using the functions only you can get and set the detaisl
        * */

        String user = login.getUsername();
        System.out.println("Username is : " + user);

        login.setUsername("Dharam");
        System.out.println( "New Username : " + login.getUsername());
     }
}
