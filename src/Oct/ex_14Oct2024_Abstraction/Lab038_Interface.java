package Oct.ex_14Oct2024_Abstraction;

public class Lab038_Interface {
    public static void main(String[] args) {
        ABC c = new ABC();
        c.f1();
        c.f4();
    }
}

class ABC implements I1,I2{ // multiple inheritance is possible by using interfaces
    @Override
    public void f1(){}

    @Override
    public void f2(){}

    @Override
    public void f3() {}

    @Override
    public void f4() {}
}

interface I1{
    void f1();
    void f2();
}
interface I2{
    void f3();
    void f4();
}

interface  I3{
    default void f5(){
        System.out.println("Default method can only have body in an interface");
    }

    static void s1(){
        System.out.println("Static method can also have body in an interface");
    }
    void f6();
}

class Test1 extends ABC implements I1,I2{} //possible extends comes before implements