package Nov.CodingPractice;

public class DuplicateinString {
    public static void main(String[] args) {
        String name = "Preeti";
        String dupName = "";
        for(int i = 0; i<name.length();i++){
            if(dupName.indexOf(name.charAt(i)) == -1){
                dupName = dupName + name.charAt(i);
            }
        }
        System.out.println(dupName);
    }
}
