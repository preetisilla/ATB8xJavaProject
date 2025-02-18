package Nov.ex_04Nov2024_CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Lab074_Map2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("id",1); //Key Value pair
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);
        map.put("id5",null);
        map.put(null,100); // only one null key is allowed as key is unique
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(34));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id3"));


        System.out.println("------------------------");

        //for each loop for Map
        for(Map.Entry<String,Integer> item: map.entrySet()){
            System.out.println(item.getKey() + "-->" + item.getValue());
        }

    }
}
