package Oct.ex_23Oct2024_TryCatchFinally;

public class Bank {
    int amount;
    String currency;

    public Bank(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(Bank bankname) {
        if (!bankname.currency.equalsIgnoreCase("INR")) {
            try {
                throw new Exception("Currency mismatch"); //Custom exception
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
            return bankname.amount + this.amount;


    }

}
