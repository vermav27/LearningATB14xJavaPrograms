package ex_03_Operators;

public class Lab028_LogicalOperator {
    public static void main(String[] args) {
        boolean x = true; //1
        boolean y = false; //0

        System.out.println((x || y) + " <-- Should be true");
        System.out.println((x && y) + " <-- Should be false");
        System.out.println((x || x) + " <-- Should be true");
        System.out.println((x && x) + " <-- Should be true");
        System.out.println((y || y) + " <-- Should be false");
        System.out.println((y && y) + " <-- Should be false");

    }
}
