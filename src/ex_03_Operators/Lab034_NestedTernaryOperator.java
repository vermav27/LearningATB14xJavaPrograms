package ex_03_Operators;

public class Lab034_NestedTernaryOperator {
    public static void main(String[] args) {
        // Ternary operator is like if else use
        // Result = Condition ? (Condition ? "Result is this If True" : "Result is this If False") : "Result is this If False";

        int age = 22;
        String CanIDrink = age>18 ? (age>21 ? "You can go to goa and drink" : "You can go to goa but you cannot drink") : "You cannot go to goa";
        System.out.println(CanIDrink);

    }
}
