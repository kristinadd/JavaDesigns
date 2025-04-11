package PerfectVersion;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public class SavingsAccount implements BankAccount {
    private final UUID id;
    private final int accountNumber;
    private final Currency currency;
    private BigDecimal balance;

    public SavingsAccount(int accountNumber, Currency currency) {
        this.id = UUID.randomUUID();
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = BigDecimal.ZERO;
    }

    public UUID getId() { return id; }
    public int getAccountNumber() { return accountNumber; }
    public Currency getCurrency() { return currency; }
    public BigDecimal getBalance() { return balance; }

    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if (balance.compareTo(amount) < 0)
            throw new IllegalArgumentException("Insufficient funds");
        balance = balance.subtract(amount);
    }
}
