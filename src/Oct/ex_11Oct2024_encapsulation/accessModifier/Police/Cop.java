package Oct.ex_11Oct2024_encapsulation.accessModifier.Police;

public class Cop {
    int gun;

    public Cop(int gun) {
        this.gun = gun;
    }
    protected void canIShoot()
    {
        System.out.println("Yes allowed");
    }
}
