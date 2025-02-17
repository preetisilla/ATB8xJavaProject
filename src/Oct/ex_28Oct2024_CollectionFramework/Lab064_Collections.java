package Oct.ex_28Oct2024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab064_Collections {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(91);
        l.add(50);
        l.add(41);
        l.add(88);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
    }
}
