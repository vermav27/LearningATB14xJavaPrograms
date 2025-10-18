package ex_25_CollectionFramework.A_List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Lab199_Vector {
    public static void main(String[] args) {

        List list = new Vector();
        list.add("Hello");
        list.add("world");
        list.add("Hello");
        list.add(1);
        list.add(true);
        list.add(1);

        System.out.print("List is : " + list);

        System.out.println("Is linklist emppty ? :" + list.isEmpty());
        System.out.println("Does linklist contains hello ? : " + list.contains("hello"));
        System.out.println("Index of 1 ? " + list.indexOf(1));
        System.out.println("Size of linklist" + list.size());

        // Vector are similar to array list ( old legacy )
        // All the operations in the vector are syncronized, They are thread safe. Means
        // All the operation done by one by one by each thread
        // We use to avoid it

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
