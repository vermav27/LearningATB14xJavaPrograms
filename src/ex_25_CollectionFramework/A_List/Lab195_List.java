package ex_25_CollectionFramework.A_List;

import java.util.List;

public class Lab195_List {
    public static void main(String[] args) {
        List fruits = List.of("Orange","Apple","Banana","Watermelon","Orange");

        // In the list add and remove will not work because list is an interface and
        // add and remove methods are incomplete .
        // List can be created once only. So for that we will use ArrayList.
        fruits.add("Cherry");
        fruits.remove("Banana");
    }
}
