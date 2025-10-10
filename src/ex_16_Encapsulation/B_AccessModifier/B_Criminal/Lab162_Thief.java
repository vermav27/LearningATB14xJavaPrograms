package ex_16_Encapsulation.B_AccessModifier.B_Criminal;

import ex_16_Encapsulation.B_AccessModifier.A_Police.Lab160_cop;

public class Lab162_Thief {
    public static void main(String[] args) {
        Lab160_cop thief = new Lab160_cop(100);
        // thief.canIShoot();

        //here thief cannot shoot. because the function in cop is protected in nature and
        //protected function can only be accessed with in the folder example in Police folder it can be allower to access
        //In Criminal folder it cannot be accessed.

    }
}
