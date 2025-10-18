package ex_25_CollectionFramework.A_List;

import java.util.*;

public class Lab203_Stack {
    public static void main(String[] args) {
        //stack
        // Last In - First Out
        Stack s = new Stack();
        s.add("Vineet");
        s.add(1);
        System.out.println(s);
        // we can also use push function to add the element
        s.push("Verma");
        s.push(false);
        s.push(45);
        System.out.println(s);
        // we can use pop to delete element
        s.pop(); // so it will do last in first out
        System.out.println(s);

        // from peek function we will get the last element we have in stack
        System.out.println(s.peek());

        //  .empty function will tell if the stack is empty or not
        System.out.println(s.empty());

        // .size function to get the size of the
        System.out.println(s.size());

        // to get the value of the element at the particular index
        System.out.println(s.get(0));

        // stack can have duplicates

    }
}
