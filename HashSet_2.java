import java.util.*;
import java.lang.*;
import java.io.*;
public class HashSet_2 {
    public static void main(String[] args) {
        HashSet <Integer>even = new HashSet<Integer>();
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        System.out.println(even);
        HashSet <Integer>hs = new HashSet<Integer>();
        hs.addAll(even);
        hs.add(10);
        System.out.println(hs);
        // .removeAll()
        hs.removeAll(even);
        System.out.println(hs);
    }
}
