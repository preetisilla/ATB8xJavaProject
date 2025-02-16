package Oct.ex_23Oct2024_TryCatchFinally;

public class Lab051_CustomException {
    public static void main(String[] args) {
        Bank sbi = new Bank(100,"INR");
        Bank icici = new Bank(123,"INR");
        Bank jp_chase = new Bank(101,"USD");
        System.out.println(sbi.add(icici));
        System.out.println(sbi.add(jp_chase));
    }
}
