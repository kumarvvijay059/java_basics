import java.sql.SQLOutput;
import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayList_1 {
    public static void main(String[] args) {
        //Declaring ArrayList
        //ArrayList <Integer> al = new Arraylist<Integer>();
        //ArrayList <String> al = new Arraylist<String>();
        //List al = new ArrayList();
        ArrayList al = new ArrayList();

        //Adding new elements to the ArrayList.
        al.add(100);
        al.add("vijay");
        al.add(19.3);
        al.add('A');
        al.add(true);
        System.out.println(al); //printing ArrayList.
        // .size()
        System.out.println("The size of the ArrayList is "+al.size()); //printing size of the ArrayList.
        // .remove()
        al.remove(1);
        System.out.println(al);
        //inserting new element.
        al.add(1 , "brother");
        System.out.println(al);
        // .get()  // Retrieving specific element.
        System.out.println(al.get(1));
        // changing element.
        al.set(3 , 'B');
        System.out.println(al);
        //search - return true or false.
        System.out.println(al.contains('c'));
        System.out.println(al.contains(19.3));
        // .isEmpty()
        System.out.println(al.isEmpty());
        // 1) for loop
        for(int i = 0 ; i<al.size() ; i++)
        {
            System.out.println(al.get(i));
        }
        // 2) for ..each loop.
        System.out.println("printing elements using Object loop.");
        for(Object e:al)
        {
            System.out.println(e);
        }
        // 3) .iterator().
        System.out.println("printing elements using iterator method.");
        Iterator it = al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
