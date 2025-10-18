package ex_25_CollectionFramework.D_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Lab217_HashTable {
    public static void main(String[] args) {

        // Hashtable - syncronised , slow and legacy class - Thread safe
        // Order not maintain
        // In hashtable null key is not allowed
        // In hashtable null value is not allowed

        Map<Integer,String> m3 = new Hashtable();
        m3.put(1,"Ankita");
        m3.put(5,"Kunal");
        m3.put(2,"Vineet");
        System.out.println(m3);

    }
}
