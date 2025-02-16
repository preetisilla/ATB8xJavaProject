package Oct.ex_23Oct2024_TryCatchFinally;

public class Lab050_TryCatchFinally {
    public static void main(String[] args) {
        int b = 10;
        try {
            int a = b / 0;
            System.out.println(a);
            String s = null;
            System.out.println(s.trim());

        } catch (ArithmeticException | NullPointerException e) {
            System.out.println(e.getMessage());
       }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            System.out.println("This will execute always");
        }
        System.out.println("End of Program");
    }
}
