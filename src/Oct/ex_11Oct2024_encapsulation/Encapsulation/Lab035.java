package Oct.ex_11Oct2024_encapsulation.Encapsulation;

public class Lab035 {
    public static void main(String[] args) {
        ICICIBank bank = new ICICIBank("Preeti",10000L);
        System.out.println(bank.getBal());
        bank.setBal(50000L,true);
        System.out.println(bank.getBal());
    }
}
