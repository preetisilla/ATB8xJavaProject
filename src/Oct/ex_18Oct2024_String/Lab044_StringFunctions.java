package Oct.ex_18Oct2024_String;

import java.util.Locale;

public class Lab044_StringFunctions {
    public static void main(String[] args) {
        String str = " Hello world ";
        System.out.println("Length: " + str.length());
        System.out.println("Substring: " + str.substring(1,6));
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println(str.charAt(2));
        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf("H"));
        System.out.println(str.contains("p"));
        System.out.println(str.isEmpty());
        System.out.println(str.concat("2025"));
    }
}
