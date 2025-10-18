package ex_25_CollectionFramework.B_Set;

import java.util.*;

public class Lab207_HashSet {
    public static void main(String[] args) {
        Set hs = new HashSet();
        // Hashing mechanism to store the element, no order.
        // No Duplicates

        hs.add("Pramod");
        hs.add("Verma");
        hs.add("toy");
        hs.add("maths");
        hs.add(34);
        hs.add(true);
        hs.add(null);

        System.out.println("Hashset : " + hs);
        System.out.println("Hashset size : " + hs.size());

    }
}
