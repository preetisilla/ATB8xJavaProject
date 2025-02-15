package Oct.ex_21Oct2024_WrapperClass;

public class Lab047_ExceptionHandling {
    public static void main(String[] args) {
        String ip1 = args[0]; // ArrayIndexOutOfBound exception
        //String ips = args[1];
        System.out.println(ip1); // NumberFormat exception
       // System.out.println(ips);
        int a = Integer.parseInt(ip1);
        int b = 1000/a; //ArithmeticException
    }
}
