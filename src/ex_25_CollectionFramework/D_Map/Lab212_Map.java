package ex_25_CollectionFramework.D_Map;

import java.util.*;

public class Lab212_Map {
    public static void main(String[] args) {

        // It is used to store key value pair
        // Keys cannot be duplicate
        // Map we will be doing :
        // Hashmap -- > Order donot mantain
        // Linked Hashmap
        // TreeMap
        // Hashtable ( Legacy )

        // Linked Hasmap mantain the order of the elements how we added those.

        // Treemap is used to do natural sorting ( ordering ) of its key

        System.out.println("---------HASH MAP----------");

        Map m1 = new HashMap();
        m1.put("name","Vineet");
        m1.put("roll no",1);
        m1.put("phone",89658965);

        System.out.println("Map m1 : " + m1);

        System.out.println("---------LINKED HASHMAP----------");

        Map m2 = new LinkedHashMap();
        m2.put("name","Vineet");
        m2.put("roll no",1);
        m2.put("phone",89658965);

        System.out.println("Map m2 : " + m2);

        System.out.println("---------TREE MAP----------");

        Map m3 = new TreeMap();
        m3.put("name","Vineet");
        m3.put("roll no",1);
        m3.put("phone",89658965);

        // In tree map sorting of keys will be done
        System.out.println("Map m3 : " + m3);

    }
}
