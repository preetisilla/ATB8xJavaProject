package Sept.Tasks;

public class VowelCount {
    public static void main(String[] args) {
       String name = "Preeti123";
       String name1 = name.toLowerCase();
       int vowelCount = 0;
       int consonantCount = 0;
       for (int i = 0; i < name1.length(); i++) {
           char c = name1.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||c == 'u'){
                vowelCount++;
            }
            else if(c>='a' && c<='z'){
                consonantCount++;
            }
       }
        System.out.println("Total vowels are "+ vowelCount);
        System.out.println("Total consonant are "+ consonantCount);

    }
}
