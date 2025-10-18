package ex_25_CollectionFramework.A_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab196_ArrayList {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("Pramod");
        al.add("Vineet");
        al.add(null);
        al.add(123);

        System.out.println(al);
        System.out.println(al.size());
        //Order is mantained in the case of arraylist

        List l = new ArrayList(); //dynamic dispatch
        l.add("apple");
        l.add("Mango");
        l.add(145);
        l.add(true);
        l.add(1);
        l.add(1);

        System.out.println("List Size : " + l.size());
        System.out.println("Is List Empty ? : " + l.isEmpty());
        System.out.println("Is list contains 1 ? " + l.contains(1));
        System.out.println("Index of 145 : " + l.indexOf(145));
        System.out.println(l);
        // Print every element using for loop
        for(int i = 0 ; i < l.size() ; i++){
            System.out.println(l.get(i));
        }

        //Print using foreach loop
        for(Object o : l){
            System.out.println(o);
        }

        //Print using Iterator
        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //Iterator will work everywhere for all collection framework
    }
}
