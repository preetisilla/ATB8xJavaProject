package Oct.ex_21Oct2024_WrapperClass;

public class Lab046 {
    public static void main(String[] args) {
        int i1 = 10; // java is not pure OOPs due to primitive data type

        Integer i = 11;
        int i2 = i.compareTo(i1);
        System.out.println(i2);

        Integer a2 = 42; // Autoboxing - Integer is a wrapper class of int
        int value = a2; // Unboxing - Integer --> int

        String num = "10";
        //  int a = num; // non primitive datatype to Primitive is not possible
        Integer a = Integer.valueOf(num);
        int a3 = a;
        System.out.println(a3);

        Integer b = Integer.parseInt("10");
        System.out.println(b);

    }
}
