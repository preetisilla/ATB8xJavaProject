package Oct.ex_28Oct2024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab065_Datatype {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(123);
        //l.add("Preeti"); // Only Integer is allowed

        List<String> names = new ArrayList(); //List only supports object/ wrapper class. Not primitive datatype like int
        names.add("Preeti");
    }
}
