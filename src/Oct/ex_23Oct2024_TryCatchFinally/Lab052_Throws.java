package Oct.ex_23Oct2024_TryCatchFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab052_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        extracted();
    }

    private static void extracted() throws FileNotFoundException{
        FileInputStream f = new FileInputStream("xyz.txt");
    }
}
