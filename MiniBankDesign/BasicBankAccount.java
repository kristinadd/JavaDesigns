package MiniBankDesign;
public class BasicBankAccount implements BankAccount {
  private double balance;

  public BasicBankAccount(double balance) {
   this.balance = balance;
  }

  @Override
  public double getBalance() {
   return balance;
  }

  @Override
  public double deposit(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Deposit amount must be greater than zero.");
    }
    balance += amount;
    return balance;
  }

  @Override
  public double withdraw(double amount) {
    if (balance > amount) {
      balance -= amount;
      System.out.printf("The current balance is: %.2f%n", balance);
      return balance;
    } else {
      System.out.printf("You don't have enough balance to withdraw the amounf of: %.2f%n", amount);
      System.out.printf("Your current balance is: %.2f%n", balance);
      return balance; 
    }
  }

  @Override
  public String toString() {
   return String.format("account: ⭐️ Basic Bank Account, balance: %.2f", balance);
  }
}
