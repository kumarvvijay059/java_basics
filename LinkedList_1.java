import java.util.*;
import java.lang.*;
import java.io.*;
public class LinkedList_1 {
    public static void main(String[] args) {
        //Declaring LinkedList.
        // LinkedList <Integer> l = new LinkedList<Integer>();
        // LinkedList <String> l = new LinkedList<String>();
        LinkedList l = new LinkedList();
        //Adding elements to the LinkedList.
        l.add(99);
        l.add("greetings");
        l.add(19.3);
        l.add('A');
        l.add(true);
        l.add(null);
        System.out.println(l);
        // .size()
        System.out.println(l.size());
        // .remove();
        l.remove(3);
        System.out.println(l);
        // Inserting element with the help of index.
        l.add(3 , 'H');
        System.out.println(l);
        // Retrieving value.
        System.out.println(l.get(1));
        // Changing value using .set()
        l.set(4 , false);
        System.out.println(l);
        // .contains() - returns true or false.
        System.out.println(l.contains('H'));
        System.out.println(l.contains(45));
        System.out.println(l.isEmpty());
        // Reading elements using for loop.
        System.out.println("Printing elements using for loop");
        for(int i = 0 ; i<l.size() ; i++)
        {
            System.out.println(l.get(i));
        }
        // Reading elements using for ..each loop.
        System.out.println("Printing elements using for ..each loop");
        for(Object e:l)
        {
            System.out.println(e);
        }
        // Reading elements using iterator method.
        System.out.println("Printing elements using iterator method");
        Iterator it = l.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
