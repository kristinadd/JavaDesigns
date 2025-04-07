package Composition;

import java.math.BigDecimal;

public class PersonalAccount {
  private BankAccount account;

  public PersonalAccount(BankAccount account) {
    this.account = account;
  }

  public int getAccountNumber() {
    return account.getAccountNumber(); // delegates
  }

  public BigDecimal getBalance() {
    return account.getBalance(); // delegates
  }
}

