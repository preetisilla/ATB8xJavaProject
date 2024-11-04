package Sept.ex_20092024;

public class Lab024 {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int c = 30;
        int max = (a>b && a>c)?a:((b>c && b>a)?b:c);
        System.out.println(max);
    }
}
