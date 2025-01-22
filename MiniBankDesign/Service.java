package MiniBankDesign;

public class Service {
  private double balance;
  private BankAccount account;

  public Service(BankAccount account) {
    this.balance = account.getBalance();
    this.account = account;
   };

   public void deposit(double amount) {
      account.deposit(amount);
   }

   public void withdraw(double amount) {
      account.withdraw(amount);
   }

  public double getBalance() {
   return balance;
  }
}
