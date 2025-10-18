package ex_25_CollectionFramework.A_List;

import java.util.LinkedList;
import java.util.List;

public class Lab198_LinkList {
    public static void main(String[] args) {

        List list = new LinkedList();
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

        // In linklist -> If a element is present in linklist node then it knows the location of another next
        // element . Next element contains the location of next element
        // In linklist prder is maintained
        // V IMP : If you are doing a lot of insertion or deletion then use --> LinkList
        // V IMP : If you just have to access the elements fast --> ArrayList

    }
}
