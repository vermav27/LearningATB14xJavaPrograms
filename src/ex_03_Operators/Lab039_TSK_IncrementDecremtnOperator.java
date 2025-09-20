package ex_03_Operators;

public class Lab039_TSK_IncrementDecremtnOperator {
    public static void main(String[] args) {
        int a = 10;
        // ( --a + a++ + a-- )
        // A = --a -> A = 9
        // B = a++ -> a = 9 -> B = 9 --> a = 10
        // C = a-- -> C = 10 -> a = 9
        System.out.println(--a + a++ + a--); //Should be 28

    }
}
