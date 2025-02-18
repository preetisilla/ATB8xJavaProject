package Nov.ex_04Nov2024_CollectionFramework;

public class Lab077_Generic {
    public static void main(String[] args) {
        temp(1);
        temp(true);
        temp("Preeti");
        printTs(123,false,"Hello");

        Math.max(1,2); // int
        Math.max(1.5,1.6); // double
        Math.max(1.33f,2.45f); // float
        Math.max(234689l,98765432l); //long / Math.max() is generic function
    }

    public static<T> void temp(T a){
        System.out.println(a);
    }

    public static <T1,T2,T3> void printTs(T1 a , T2 b , T3 c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
