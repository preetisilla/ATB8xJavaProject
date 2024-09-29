package Sept.ex_18091990;

public class Lab022 {
    public static void main(String[] args) {
        // Increment (++) and decrement (--) operators
        //Pre Post

        //Pre increment operator
        // value is incremented first then stored in the value
        int a = 10;
        int b = ++a;// a= a+1
        System.out.println(b);

        //Post increment
        //value is printed first then increased
        int c = 10;
        int d = c++;
        System.out.println(d++);
        System.out.println(d);
    }
}
