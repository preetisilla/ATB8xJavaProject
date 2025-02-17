package Oct.ex_30Oct2024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab070 {
    public static void main(String[] args) {
        Student s1 = new Student("Preeti",1);
        Student s2 = new Student("Amit",2);
        Student s3 = new Student("Anil",3);

        List<Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        System.out.println(myStudents);
        System.out.println("-------------------");
        System.out.println(s1.PrintDetails());
        System.out.println(s2.PrintDetails());
        System.out.println(s3.PrintDetails());

    }
}
class Student{
    String name;
    Integer rollno;

    public Student(String name, Integer rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        this.rollno = rollno;
    }

    public String PrintDetails(){
        return "Student{" +
                "name = " + name + '\'' +
                ", roll no = " + rollno + '}';
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = " + name + '\'' +
                ", roll no = " + rollno + '}';
    }


}
