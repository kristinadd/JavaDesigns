package Composition;

import java.math.BigDecimal;

public class BankAccount {
  private int accountNumber;
  private BigDecimal balance;

  public BankAccount() {
    this.accountNumber = 1111111111;
    this.balance = new BigDecimal(0.00);
  }

  public BankAccount(int accountNumber) {
    this.accountNumber = accountNumber;
    this.balance = new BigDecimal(0.00);
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public BigDecimal getBalance() {
    return balance;
  }
}