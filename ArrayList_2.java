import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("jay");
        al.add("vijay");
        al.add("ajay");
        al.add("sanjay");
        al.add("abhay");
        al.add("pankaj");
        ArrayList al1 = new ArrayList();
        al1.add("aniket");
        al1.addAll(al);
        System.out.println(al);
        System.out.println(al1);
        al1.removeAll(al);
        System.out.println(al1);
        // Sorting.
        Collections.sort(al);
        System.out.println(al);
        // Sorting in reverse order.
        Collections.sort(al , Collections.reverseOrder());
        System.out.println(al);
        // Shuffling.
        Collections.shuffle(al);
        System.out.println(al);
    }
}
