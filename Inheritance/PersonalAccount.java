package Inheritance;

public class PersonalAccount extends BankAccount {
  // no constructor, so java creates one for you, and inside of it 
  // it calls the super class no argument constructor.
  // only works for no argument constructors

  public PersonalAccount(int accountNumber) {
    super(accountNumber);
  }
}

