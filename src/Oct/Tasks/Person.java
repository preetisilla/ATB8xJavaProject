package Oct.Tasks;

public class Person {
    String name;
    int age;
    long phone_number;
    String address;
    String DOB;
    boolean isMarried;

    Person(){
        System.out.println("It is a Default Constructor");
    }

    Person(String name1,int age1,String address1,String DOB1,long phone,boolean isMarried1){
        this.name = name1;
        this.age = age1;
        this.address = address1;
        this.phone_number = phone;
        this.DOB = DOB1;
        this.isMarried = isMarried1;
        System.out.println("This is a Parameterised constructor");
    }

    int walk(){
        System.out.println("Walking is good for health for all ages "+ age);
        return age;
    }

    void Sleep(){
        System.out.println("Sleep well Eat Well "+name);
    }

    void Eat(String name2){
        System.out.println("Eat consciously "+name2);

    }

    String Help(String phone2){
        System.out.println("Contact for help "+phone2);
        return phone2;
    }

}
