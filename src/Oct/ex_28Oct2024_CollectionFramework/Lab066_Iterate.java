package Oct.ex_28Oct2024_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab066_Iterate {
    public static void main(String[] args) {
        List<String> str = new ArrayList();
        str.add("Preeti");
        str.add("Silla");
        str.add("Hello");

        System.out.println("To Print ArrayList ---------");

        for(String st: str){
            System.out.println(st);
        }

        System.out.println("Print Arraylist 2 ------------");

        for(int i = 0; i<str.size(); i++){
            System.out.println(str.get(i));
        }

        System.out.println("Print ArrayList 3 ------------");
        // Iterator interface
        Iterator<String> itr = str.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
