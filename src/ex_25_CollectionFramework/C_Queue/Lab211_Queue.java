package ex_25_CollectionFramework.C_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab211_Queue {
    public static void main(String[] args) {
        //Queue -> 0.001% use in automation
        //Only one type of datatype allowed
        //First In first Out

        PriorityQueue pq = new PriorityQueue();
        pq.add("Vineet");
        pq.add("Verma");
        pq.add("Vineet");
        System.out.println("Queue : " + pq);

        /*Extra Functions :
        offer - similar to - add
        peek - see the first element
        poll - delete
        * */

        System.out.println("Peek : " + pq.peek());
        System.out.println("poll : " + pq.poll());
        System.out.println("after poll : " + pq);
        System.out.println("Offer : " + pq.offer("India"));
        System.out.println("After pffer : " + pq);
        System.out.println("Offer : " + pq.offer("Simba"));
        System.out.println("After 2nd pffer : " + pq);

    }
}
