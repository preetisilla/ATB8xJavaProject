package Oct.ex_30Oct2024_CollectionFramework;

import java.util.Stack;

public class Lab069_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.add("Preeti");
        s.add("Silla");
        System.out.println(s);

        Stack books = new Stack();
        books.push("Python");
        books.push("Java");
        books.push("C#");
        System.out.println(books.peek());
        System.out.println(books);
        System.out.println(books.pop());
        System.out.println(books);
        System.out.println(books.add("rhymes")); // add at the last
        System.out.println(books);
        books.add(1,"Fun"); // add as per index
        System.out.println(books);
    }
}
