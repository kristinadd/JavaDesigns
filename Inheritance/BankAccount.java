package Inheritance;

import java.math.BigDecimal;

public class BankAccount {
  private int accountNumber;
  private BigDecimal balance;


  // no argument constructor 
  public BankAccount() {
    this.accountNumber = 1111111111;
    this.balance = new BigDecimal(0.00);
  }

  // argument constructor 
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
