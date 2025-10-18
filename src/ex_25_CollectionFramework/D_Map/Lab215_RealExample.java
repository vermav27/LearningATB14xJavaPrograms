package ex_25_CollectionFramework.D_Map;

import java.util.*;

public class Lab215_RealExample {
    public static void main(String[] args) {
        Map<String,String> student1 = new HashMap<>();
        student1.put("name","Diwakar");
        student1.put("phone","987456522");
        student1.put("address","Delhi");

        for(Map.Entry<String,String> item: student1.entrySet()){
            System.out.println(item.getKey() + "-->" + item.getValue());
        }

    }
}
