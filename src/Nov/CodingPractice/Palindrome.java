package Nov.CodingPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String pstring = sc.nextLine().toLowerCase();
        String revString = "";
        for (int i = pstring.length()-1; i>=0; i--){
            revString = revString + pstring.charAt(i);
        }
        System.out.println(revString);
        if(pstring.equals(revString)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
