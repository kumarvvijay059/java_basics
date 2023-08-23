import java.util.*;
import java.lang.*;
import java.io.*;
public class HashSet_3 {
    public static void main(String[] args) {
        HashSet <Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("HashSet 1 "+set1);
        HashSet <Integer> set2 = new HashSet<Integer>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("HashSet 2 "+set2);
        // Union.
        //set1.addAll(set2);
        //System.out.println("Union of set1 and set2 "+set1);
        // Intersection.
        //set1.retainAll(set2);
        //System.out.println("Intersection "+set1);
        // Difference
        //set1.removeAll(set2);
        //System.out.println("difference "+set1);
        // Subset.
        System.out.println(set1.containsAll(set2)); // return true or false
    }
}
