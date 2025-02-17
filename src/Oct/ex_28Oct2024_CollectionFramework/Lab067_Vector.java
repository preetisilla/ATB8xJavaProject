package Oct.ex_28Oct2024_CollectionFramework;

import java.util.Vector;

public class Lab067_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(); // Same as ArrayList but
        // it is thread safe, synchronised
        //time consuming
        //one by one usage // slower
        v.add("Preeti");
        v.add("Silla");
        v.add("Sss");
        System.out.println(v);
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Silla"));
        System.out.println(v.lastIndexOf("Silla"));
        System.out.println(v.contains("Silla"));
    }
}
