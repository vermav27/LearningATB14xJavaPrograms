package ex_03_Operators;

public class Lab027_RelationalOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        boolean result;
        System.out.println( (x>y) + " <-- Should be false");
        System.out.println((x<y) + " <-- Should be true");
        System.out.println((x == y) + " <-- Should be false");
        System.out.println((x <= y) + " <-- Should be true");
        System.out.println((x >= y) + " <-- Should be false");
    }
}
