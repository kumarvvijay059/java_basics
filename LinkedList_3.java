import java.util.*;
import java.lang.*;
import java.io.*;
public class LinkedList_3 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("tanjiro");
        l.add("kyonekoji");
        l.add("saturagojo");
        l.add("jujutsukaisen");
        l.add("l");
        l.add("Kent");
        System.out.println(l);
        l.addFirst("ryongoku");
        l.addLast("Sting");
        System.out.println(l);
        l.removeFirst();
        l.removeLast();
        System.out.println(l);
    }
}
