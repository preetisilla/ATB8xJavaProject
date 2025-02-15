package Oct.ex_21Oct2024_WrapperClass;

public class Lab049_TryCatch {
    public static void main(String[] args) {
        int b = 10;
        try {
            int a = b/0;
            System.out.println(a);
            String s = null;
            System.out.println(s.trim());
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
