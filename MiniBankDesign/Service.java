package MiniBankDesign;

public class Service {
  private BankAccount account;

  public Service(BankAccount account) {
    this.account = account;
   };

   public void deposit(double amount) {
      account.deposit(amount);
   }

   public void withdraw(double amount) {
      account.withdraw(amount);
   }

  public double getBalance() {
   return account.getBalance();
  }
}
