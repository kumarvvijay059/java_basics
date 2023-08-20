import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayList_3 {
    public static void main(String[] args) {
        String arr[]  = {"vijay" , "raushan" , "Quareena" , "Rohit" , "Abhishek" , "amisha" , "shoiab" , "neeraj" , "sweety"};
        for(String value:arr)
        {
            System.out.println(value);
        }

        ArrayList al = new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
