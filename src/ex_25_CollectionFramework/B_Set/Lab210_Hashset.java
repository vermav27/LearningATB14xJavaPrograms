package ex_25_CollectionFramework.B_Set;

import java.util.HashSet;

public class Lab210_Hashset {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Orange");
        hs.add("Banana");
        hs.add("Apple");
        hs.add("Papaya");
        hs.add("Apple");
        System.out.println("Hashset Elements : " + hs);

    }
}
