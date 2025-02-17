package Oct.ex_28Oct2024_CollectionFramework;

import java.util.ArrayList;

public class Lab62_ArrayList {
    public static void main(String[] args) {
        ArrayList shopping = new ArrayList();
        shopping.add("Bread");
        shopping.add("milk");
        shopping.add("milk"); // Duplicate is allowed
        shopping.add("paneer");
        shopping.add(123); // Different datatype is allowed
        shopping.add(true); //Growing or dynamic array
        shopping.add(null);

        System.out.println(shopping);

        Integer[] names = new Integer[5]; //Array is fixed size, same datatype
    }
}
