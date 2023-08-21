import java.util.*;
import java.lang.*;
import java.io.*;
public class LinkedLIst_2 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add('X');
        l.add('A');
        l.add('Z');
        l.add('Y');
        l.add('B');
        l.add('V');
        LinkedList l1 = new LinkedList();
        l1.add('P');
        System.out.println(l);
        System.out.println(l1);
        // .addAll()
        l1.addAll(l);
        System.out.println(l1);
        // .removeAll()
        l1.removeAll(l);
        System.out.println(l1);
        // Sorting.
        Collections.sort(l);
        System.out.println("Printing after sorting"+l);
        // Sorting in reverse order.
        Collections.sort(l , Collections.reverseOrder());
        System.out.println("Printing LinkedList in reverse order"+l);
        // Shuffling.
        Collections.shuffle(l);
        System.out.println("Printing linkedlist after shuffing"+l);
    }
}
