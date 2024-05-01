package entities;

public class CheckingAccount extends Account {
    public CheckingAccount() {
    }

    public double getTax() {
        return getAmount() * 0.01;
    }
}
