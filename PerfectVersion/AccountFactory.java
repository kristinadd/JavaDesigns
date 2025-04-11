package PerfectVersion;

import java.util.Currency;

public class AccountFactory {
    public enum AccountType { PERSONAL, SAVINGS }

    public static BankAccount create(AccountType type, int accountNumber, Currency currency) {
        return switch (type) {
            case PERSONAL -> new PersonalAccount(accountNumber, currency);
            case SAVINGS -> new SavingsAccount(accountNumber, currency);
        };
    }
}
