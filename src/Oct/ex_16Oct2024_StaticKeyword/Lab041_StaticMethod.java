package Oct.ex_16Oct2024_StaticKeyword;

public class Lab041_StaticMethod {
    public static void main(String[] args) {
        ATB a = new ATB(12345678L,"Preeti");
        ATB a1 = new ATB(98752L,"PP");
        a.readDocument();
        ATB.doAssignment();
    }
}

class ATB{
    Long phone;
    String name;
    static String Course_name = "ATB8";

    public ATB(Long phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    void readDocument(){
        System.out.println("Non static method");
        System.out.println(Course_name); // static variable can be used in non static method
    }

    static void doAssignment(){
        System.out.println("Static method");
        //System.out.println(phone); non static variable cannot be used in static method
    }
}
