package ex_25_CollectionFramework.B_Set;

import java.util.*;

public class Lab209_TreeSet {
    public static void main(String[] args) {
        Set ts = new TreeSet();

        //Sorting happens automatically in this

        ts.add("Mapple");
        ts.add("Apple");
        ts.add("Father");
        ts.add("Crocin");
        ts.add("Watermelon");
        ts.add("Momos");
        // null not allowed in this : ts.add(null);

        System.out.println("Treeset details : " + ts);

    }
}
