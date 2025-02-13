package Oct.ex_09Oct2024;

public class Lab034 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password123";

        VWOLogin vwologin = new VWOLogin(username,password);
        System.out.println(vwologin.getUsername());

        boolean isAdmin = true;
        vwologin.setPassword("pass",isAdmin);
        System.out.println(vwologin.getPassword());

        System.out.println();
    }
}
