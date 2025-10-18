package ex_25_CollectionFramework.D_Map;

import java.util.*;

public class Lab214_MapExample {
    public static void main(String[] args) {

        Map m1 = new HashMap();
        m1.put("id",2);
        m1.put("id2",2);
        m1.put("id3",34);
        m1.put("id6",34);
        m1.put("id4",null);
        m1.put("i5",null);
        m1.put(null,2);

        // value as null allowed as many times
        // null as key allowed only one time
        // We can also make  map datatype specific
        Map<String,Integer> m2 = new HashMap<>();
        m2.put("Hello",1);
        m2.put("World",34);
        m2.put("tons",34);

        System.out.println("Size m2 : " + m2.size());
        System.out.println("Is empty : " + m2.isEmpty());
        System.out.println("Contains key World ? : " + m2.containsKey("World"));
        System.out.println("Contains value 34 ? : " + m2.containsValue(34));
        System.out.println(" Key set :  " + m2.keySet());
        System.out.println(" Value set :  " + m2.values());

        System.out.println("value of World key : " + m2.get("World"));


        System.out.println("Map is : " + m1);

    }
}
