package Oct.ex_16Oct2024_StaticKeyword;

public class Lab039_StaticVariable {
    public static void main(String[] args) {
        Student s1 = new Student(23); // instance variable is created on the time of object loading
        Student s2 = new Student(33);
        System.out.println(Student.school_name);
        Student.school_name = "XYZ";
        System.out.println(Student.school_name);

    }
}

class Student{
    int age;
    static String school_name = "ABC"; // this is created in the time of class loading

    public Student(int age) {
        this.age = age;
    }
}
