package Oct.ex_16Oct2024_StaticKeyword;

public class Lab040_StaticBlock {
    public static void main(String[] args) {
        A a1 = new A(22); // SIB --> Static variable --> IIB --> Instance variable
        A a2 = new A(23);
        new A(24);
        A a3;
    }
}
class A{
    int age;
    {
        System.out.println("IIB");
    }

    public A(int age) {
        this.age = age;
    }

    static String s1 = "XYX";
    static {
        System.out.println("SIB");
    }
}
