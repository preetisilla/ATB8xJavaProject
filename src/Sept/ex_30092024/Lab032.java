package Sept.ex_30092024;

public class Lab032 {
    public static void main(String[] args) {
        greet();
        String name = function_type2();
        System.out.println(name);
        function_type3("Preeti");
        int result = function_type4(3,4);
        System.out.println(result);
    }
    //without parameter and without return type
    public static void greet()
    {
        System.out.println("Hi");
    }

    //without parameter and with return type
    public static String function_type2()
    {
        System.out.println("Hi");
        return "Preeti";
    }

    //with parameter and without return type
    public static void function_type3(String name)
    {
        System.out.println(name);

    }

    //with parameter and with return type
    public static int function_type4(int a, int b)
    {
        return a+b;

    }
}
