package Oct.ex_28Oct2024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab063_List {
    public static void main(String[] args) {
        //List list = new List(); cannot create a object of interface
        List list = List.of("banana","orange","grapes","apple");
        System.out.println(list);
        //list.add("guava");// not possible as List is static method

        List l = new ArrayList(); // ArrayList class is child of List interface
        l.add("1");
        l.add("2");
        l.add(123);
        l.add("2");
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains("1"));
        System.out.println(l.contains(1)); //false
        System.out.println(l.isEmpty());
        System.out.println(l.indexOf("1")); //find first occurence
        System.out.println(l.lastIndexOf("2"));

        for(int i = 0; i<l.size();i++){ //for loop
            System.out.println(l.get(i));
        }

        System.out.println("--------------");

        for(Object o:l){ // for each loop
            System.out.println(o);
        }

    }
}
