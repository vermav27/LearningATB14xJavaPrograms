package ex_25_CollectionFramework.B_Set;

import java.util.*;

public class Lab206_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set ls = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Vineet");
        hs.add("vineet");
        hs.add("Vishal");
        hs.add("Verma");
        hs.add("Vishal");

        // Donot allow duplicates
        // Order not maintained
        System.out.println(hs);

    }
}
