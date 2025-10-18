package ex_25_CollectionFramework.D_Map;

import java.util.*;

public class Lab213_MapNull {
    public static void main(String[] args) {

        Map m1 =new HashMap();

        m1.put(null,"Hello");
        m1.put(null,"world");

        //In this case two null keys are not allowed in keys, second value will replace the first value.

        System.out.println(" Map of nulls :  "+m1);
    }
}
