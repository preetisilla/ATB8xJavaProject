package Oct.ex_09Oct2024_Polymorphism.MethodOverloading;

public class Lab053 {
    public static void main(String[] args) {
        MathOperations mop = new MathOperations();

        int result = mop.add(1,2);
        System.out.println(result);

        String s = mop.add("Preeti","Silla"); // same method name with diff return type and arguments
        System.out.println(s);
    }


}
