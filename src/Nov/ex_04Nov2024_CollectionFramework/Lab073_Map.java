package Nov.ex_04Nov2024_CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Lab073_Map {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        Map m2 = new LinkedHashMap();
        Map m3 = new TreeMap();

        m1.put("name","pramod");
        m1.put("rollNo",54321);
        m1.put("phone",987654321);
        System.out.println(m1);  // Order is not maintained

        m2.put("name","pramod");
        m2.put("rollNo",54321);
        m2.put("phone",987654321);
        System.out.println(m2); // Order is maintained

        m3.put("name","pramod");
        m3.put("rollNo",54321);
        m3.put("phone",987654321);
        System.out.println(m3);  // Order is not maintained / sorted order
    }
}
