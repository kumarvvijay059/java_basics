import java.util.*;
import java.lang.*;
import java.io.*;
public class Queue_2 {
    public static void main(String[] args) {
        //Queue using LinkedList
        LinkedList pq = new LinkedList();
        //Adding elements.
        pq.add(100);
        pq.add(10);
        pq.add(200);
        pq.add(30);
        //pq.add(100); // heterogeneous data is not allowed in PriorityQueue.
        pq.add(40);
        System.out.println(pq);
        for(Object e:pq)
        {
            System.out.println(e);
        }
        // getting head element using element() , peek().
        System.out.println(pq.element()); //if empty returns exception.
        System.out.println(pq.peek()); //if empty return null.
        System.out.println(pq);
        //Return and remove element from queue
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}

