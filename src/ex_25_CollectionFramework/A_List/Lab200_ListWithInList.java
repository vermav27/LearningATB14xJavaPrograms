package ex_25_CollectionFramework.A_List;

import java.util.ArrayList;
import java.util.List;

public class Lab200_ListWithInList {
    public static void main(String[] args) {

        // We can also make a arraylist of one datatype only.
        List<String> fruit = new ArrayList();
        fruit.add("banana");
        fruit.add("chiku");
        fruit.add("mango");
        fruit.add("pineapple");

        List vegetable = new ArrayList();
        vegetable.add("potato");
        vegetable.add("tomato");
        vegetable.add("spinach");
        vegetable.add("ladyfinger");

        List food = new ArrayList();
        food.add(fruit);
        food.add(vegetable);

        System.out.println(food);
        System.out.println(food.get(1));



    }
}
