package Oct.ex_18Oct2024_String;

public class Lab045_StringBuffer_StringBuilder {
    public static void main(String[] args) {
        String str = new String("Preeti");
        String name = str.concat("Silla");
        StringBuffer sb = new StringBuffer("Preeti");
        sb.append("Silla");
        System.out.println(sb); // original string is appended/changed // ThreadSafe // Slow process
        System.out.println(str); // original string is not changed

        StringBuilder sb1 = new StringBuilder("Preeti");
        sb1.append("Silla");
        System.out.println(sb1); //original string is appended/changed // Not ThreadSafe // Fast process

        sb1.insert(6, " ");
        System.out.println(sb1);

        sb1.delete(6,7);
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);
    }
}
