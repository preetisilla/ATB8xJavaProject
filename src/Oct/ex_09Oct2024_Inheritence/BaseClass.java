package Oct.ex_09Oct2024_Inheritence;

import java.sql.SQLOutput;

public class BaseClass {
    String browser;
    BaseClass(){
        System.out.println("DC - BaseClass");
    }
    BaseClass(String b){
        System.out.println("PC - BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth)
        this.browser = browser;
        else
            System.out.println("Not Allowed");
    }

    void openBrowser(){
        System.out.println("Open default chrome browser");
    }

    void openBrowser(String browser){
        System.out.println("Open Browser " + browser);
    }

    void closeBrowser(){
        System.out.println("Close Browser");
    }
}
