package ex_16_Encapsulation.A_Encapsulation;

public class Lab158_GoodLogin {

        private String username;
        private String Password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    Lab158_GoodLogin(String usr, String pwd){
            this.username = usr;
            this.Password = pwd;
        }

}
