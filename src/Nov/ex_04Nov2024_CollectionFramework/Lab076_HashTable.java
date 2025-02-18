package Nov.ex_04Nov2024_CollectionFramework;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab076_HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");
       // ht.put(3,null); null is not allowed
        System.out.println(ht);

        HashMap<Integer,String> ht1 = new HashMap<>();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
        ht1.put(3,null);
        System.out.println(ht1);

        Enumeration<Integer> e = ht.keys();
        while(e.hasMoreElements()){
            System.out.println(ht.get(e.nextElement()));
        }
    }
}
