package Interface;

import java.math.BigDecimal;

public class SavingsAccount implements BankAccount{
  private int accountNumber;
  private BigDecimal balance;

  public SavingsAccount() {
    this.accountNumber = 1234;
    this.balance = new BigDecimal(0.00);
  }
  
  @Override
  public int getAccountNumber() {
    return accountNumber;
  }

  @Override 
  public BigDecimal getBalance() {
    return balance;
  }
}
