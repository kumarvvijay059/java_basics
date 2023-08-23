import java.util.*;
import java.lang.*;
import java.io.*;
public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> h = new Hashtable<Integer,String>();
        h.put(100 , "Ram");
        h.put(101 , "Alok");
        h.put(102 , "Ravan");
        h.put(103 , "Sita");
        h.put(104 , "Neelu");
        h.put(105 , "Lakshman");
        //h.put(null , "L"); //null not allowed as key as well as value.
        //h.put(106 , null);
        System.out.println(h.get(104));
        System.out.println(h.containsKey(105));
        System.out.println(h.containsValue("Dashrath"));
        System.out.println(h);
        System.out.println(h.isEmpty());
        System.out.println(h.keySet());
        System.out.println(h.values());
        System.out.println(h.entrySet());
        for(Object i :h.values())
        {
            System.out.println(i);
        }
        for(Object i :h.keySet())
        {
            System.out.println(i);
        }
        for(Object i :h.keySet())
        {
            System.out.println(i +"    "+h.get(i));
        }
        for(Map.Entry entry:h.entrySet())
        {
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
        Set s = h.entrySet();
        Iterator itr = s.iterator();
//        while(itr.hasNext())
//        {
//            Map.Entry entry = (Entry)itr.next();
//            System.out.println(entry.getKey()+"    "+entry.getValue());
//        }

    }
}
