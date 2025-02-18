package Nov.CodingPractice;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        boolean anagrams = true;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("Strings are not Anagrams 1");
            anagrams = false;
        }
        else {
            char[] arr1 = s1.toCharArray();
            Arrays.sort(arr1);
            char[] arr2 = s2.toCharArray();
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    anagrams = false;
                }
            }
            if(!anagrams){
                System.out.println("Strings are not Anagrams 2");
            }
        }
        if(anagrams){
            System.out.println("Strings are Anagrams");
        }
    }
}
