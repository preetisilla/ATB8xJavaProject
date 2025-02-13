package Oct.ex_09Oct2024_Inheritence;

public class Main {
    public static void main(String[] args) {
        BaseClass b1 = new TestCase1(); // Dynamic Dispatch
        b1.openBrowser("edge");
        b1.closeBrowser();
    }
}
