package ex_25_CollectionFramework;

import java.util.*;

public class Lab201_ArrayListCollectionSort {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(5);
        marks.add(4);
        marks.add(1);
        marks.add(8);
        marks.add(9);

        System.out.println("Marks : " + marks);
        //Sorting
        Collections.sort(marks);
        System.out.println("Sorted Marks : " + marks);

        //Sorting Reverse
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println("Reverse Soring : " + marks);

    }
}
