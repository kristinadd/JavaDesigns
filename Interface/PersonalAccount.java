package Interface;

import java.math.BigDecimal;

public class PersonalAccount implements BankAccount{
  private int accountNumber;
  private BigDecimal balance;

  public PersonalAccount() {
    this.accountNumber = 1234567890;
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
