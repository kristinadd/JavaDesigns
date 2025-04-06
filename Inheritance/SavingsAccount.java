package Inheritance;

import java.math.BigDecimal;

public class SavingsAccount extends BankAccount {
  // no constructor, so java creates one for you, and inside of it 
  // it calls the super class no argument constructor.
  // only works for no argument constructors

  public void fun() {
    System.out.println("🐐 method in the SavingsAccount class");
  }

  // @Override
  public BigDecimal getBalance() {
    return new BigDecimal(9999999.99);
  }
}
