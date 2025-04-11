package PerfectVersion;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public interface BankAccount {
    UUID getId();
    int getAccountNumber();
    Currency getCurrency();
    BigDecimal getBalance();
    void deposit(BigDecimal amount);
    void withdraw(BigDecimal amount);
}
