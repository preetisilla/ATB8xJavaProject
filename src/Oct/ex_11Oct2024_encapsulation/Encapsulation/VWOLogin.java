package Oct.ex_11Oct2024_encapsulation.Encapsulation;

public class VWOLogin {
    private String username;
    private String password;

    public VWOLogin(String username,String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin)
        this.password = password;
        else System.out.println("Not Allowed");
    }
}
