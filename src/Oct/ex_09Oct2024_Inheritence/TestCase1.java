package Oct.ex_09Oct2024_Inheritence;

public class TestCase1 extends BaseClass{
    // Single inheritance
    TestCase1()
    {
        super(); //DC of parent
    }

    public void setBrowser(String browser, boolean isAuth){
        super.setBrowser(browser,isAuth);
    }
}
