package Oct.ex_14Oct2024_Abstraction;
//only 1 public class in a java file
public class Lab037_Inheritance {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50k();
        s1.loan25k();

//        Father f1 = new Father() { // abstract class cannot be initiated
//            @Override
//            void loan50k() {
//
//            }
//        }
    }
}

//Abstract class
abstract class Loan{
    abstract void loan50k();
}

abstract class Loan1{
    void loan10k(){}
}

//Concrete class
class student{}
class banker{}