package Nov.ex_04Nov2024_CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab075_Map3 {
    public static void main(String[] args) {
        HashMap<String,String> student1 = new HashMap<>();
        student1.put("name","preeti");
        student1.put("rollNo","1");
        student1.put("phone","987532");
        System.out.println(student1);

        HashMap<String,String> student2 = new HashMap<>();
        student2.put("name","payal");
        student2.put("rollNo","2");
        student2.put("phone","85426899");
        System.out.println(student2);

        List students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

    }
}
