package CardDistributionSystem;

public class BankAccount {
  private double balance;

  public BankAccount(double balance) {
    this.balance = balance;
  }

  public void deposit(double amount) {
    if ( amount > 0 ) {
      balance += amount;
    } else {
      System.out.println("Deposit amount can't be 0 or negative.");
    }
  }

  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Not enough balance");
    }
  }

  public double getBlance() {
    return balance;
  }
}
