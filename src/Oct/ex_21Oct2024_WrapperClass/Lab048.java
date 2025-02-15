package Oct.ex_21Oct2024_WrapperClass;

import java.io.FileInputStream;

public class Lab048 {
    public static void main(String[] args) {
        //Checked exception / compile time exception
       // FileInputStream file = new FileInputStream("c://x.txt");
        //JVM knows this exception

        //Unchecked / Runtime exception
        int a = 19;
        int b = a/0;
        System.out.println(b);

    }
}
