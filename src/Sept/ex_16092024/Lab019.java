package Sept.ex_16092024;

public class Lab019 {
    public static void main(String[] args) {
        //Operators
        int a = 10; //= is assignment operator- assign right value to variable name
        int b = 20;
        System.out.println(a+b); // +,-,*,/,% arithemetic operator

       // int enum = 10; // enum is a keyword cant be a variable name

        int c = +65; // + -> unary operator + is by default
        int d = -6; // - is unary operator
        System.out.println(c+d);


        String firstName = "Preeti";
        String lastName = "Silla";
        System.out.println(firstName + lastName); // + is concatenation operator in string
        System.out.println(a+b+firstName+lastName); // addition then concatenate
        System.out.println(firstName+lastName+a+b); // concatenate all
        System.out.println(firstName+lastName+(a+b));// concatenate then addition

        int e = 10;
        //e += 20; // +=, -=,  *=, /= compound assignment operator
        e -= 20; // e = e-20
        System.out.println(e);

        //Relational operators
        // > < , >=  <= , != ,== returns true or false
        boolean f = a>b;
        System.out.println(f);

        // Logical operator
        // !, &&, || -> not , and , or operator
        boolean g = true;
        boolean h = true;
        boolean i = g && h;
        System.out.println(i);
        System.out.println(!i);

        // new operator
        String s1 = new String("Preeti");

        //instanceof operator
        System.out.println(s1 instanceof String);





    }

}
