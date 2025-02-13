package Oct.ex_11Oct2024_encapsulation.Encapsulation;

public class ICICIBank {
    private String name;
    private Long bal;

    public ICICIBank(String name, Long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBal() {
        return bal;
    }

    public void setBal(Long bal,boolean isAdmin) {
        if(isAdmin)
        this.bal = bal;
        else System.out.println("Not allowed");
    }
}
