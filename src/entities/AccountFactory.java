package entities;

public class AccountFactory {
    public static Account AccountFactory(String accountType) {
        if (accountType.equalsIgnoreCase("SAVINGS ACCOUNT")) {
            return new SavingsAccount();
        } else if (accountType.equalsIgnoreCase("CHECKING ACCOUNT")) {
            return new CheckingAccount();
        }
        throw new IllegalArgumentException("Invalid account type");
    }
}
