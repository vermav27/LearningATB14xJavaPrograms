package ex_03_Operators;

public class Lab033_TernaryOperator {
    public static void main(String[] args) {
        // Ternary operator is like if else use
        // Result = Condition ? "Result is this If True" : "Result is this If False";

        int age = 19;
        String CanIVote = age>18 ? "Yes, You can vote !" : "No, You Cannot vote !";
        System.out.println(CanIVote);

    }
}
