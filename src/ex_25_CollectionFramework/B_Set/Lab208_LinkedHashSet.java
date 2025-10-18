package ex_25_CollectionFramework.B_Set;

import java.util.*;

public class Lab208_LinkedHashSet {
    public static void main(String[] args) {

        Set lhs = new LinkedHashSet();

        // Linklist mechanism to store element
        //Order will mantain, no duplicates

        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Apple");
        lhs.add("Papaya");
        lhs.add(1123);
        lhs.add(false);
        lhs.add(null);


        System.out.println(lhs);
        System.out.println("Linklist set is empty ? : " + lhs.isEmpty());
        System.out.println("Linklist contains 'Apple' ? " + lhs.contains("Apple"));
        System.out.println("Linklist size : " + lhs.size());



    }
}
