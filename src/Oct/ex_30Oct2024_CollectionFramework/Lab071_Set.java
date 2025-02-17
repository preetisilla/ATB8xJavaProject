package Oct.ex_30Oct2024_CollectionFramework;

import java.util.*;

public class Lab071_Set {
    public static void main(String[] args) {
        //List - duplicates allowed
        //Set - duplicate is not allowed
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Preeti");
        hs.add("Silla");
        hs.add("preeti");
        System.out.println(hs); // Hashing mechanism / no order / only storing / fastest way to access

        lhs.add("Preeti");
        lhs.add("Silla");
        lhs.add("preeti");
        System.out.println(lhs); // LinkedList mechanism / order is maintained // insertion n deletion is easy

        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        ts.add("Watermelon");
        System.out.println(ts); //  Black and Red tree / order is maintain // with sorting

        for(Object o:ts)
        {
            System.out.println(o);
        }
        System.out.println("------------------");
        Iterator it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
