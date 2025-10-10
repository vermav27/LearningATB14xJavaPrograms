package ex_16_Encapsulation.B_AccessModifier.A_Police;

public class Lab160_cop {
    public int gun;
    String iCard;

    public Lab160_cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes You can Shoot !");
    }
}
