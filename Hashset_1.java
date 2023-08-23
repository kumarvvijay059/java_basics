import java.util.*;
import java.lang.*;
import java.io.*;
public class Hashset_1 {
    public static void main(String[] args) {
        // HashSet hs = new HashSet(100); // initial capacity 100
        // HashSet hs = new HashSet(100,(float)0.90);
        // HashSet <Integer>hs = new HashSet<Integer>();
        HashSet hs = new HashSet(); // default capacity 16 and load factor is 0.75
        // Adding elements to HashSet
        hs.add(100);
        hs.add("welcome");
        hs.add(10.5);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs);
        // .remove()
        hs.remove('A');
        System.out.println("after deleting some element "+hs);
        // .contains()
        System.out.println(hs.contains('A')); // return true or false
        System.out.println(hs.isEmpty()); // return true or false
        // Reading elements from HashSet usin ..each for loop
        System.out.println("Printing elements using ..each for loop");
        for(Object e:hs)
        {
            System.out.println(e);
        }
        // Reading elements using iterator method
        System.out.println("Printing elemets using iterator method");
        Iterator it = hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
