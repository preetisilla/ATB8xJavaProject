package Nov.CodingPractice;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age);
        sc.close();
    }
}
