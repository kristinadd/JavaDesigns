package MiniBankDesign;

public class Service {
  private double balance;

  public Service(BankAccount account) {
    this.balance = account.getBalance();
    };

  public double deposit(double amount) {
     balance += amount;
     System.out.printf("The current balance is: %.2f%n", balance);
     return balance;
  }

  public double withdraw(double amount) {
     if (balance > amount) {
        balance -= amount;
        System.out.printf("The current balance is: %.2f%n", balance);
        return balance;
     } else {
        System.out.printf("You don't have anough balance to withdraw the amounf of: %.2f%n", amount);
        System.out.printf("Your current balance is: %.2f%n", balance);
        return balance; 
     }
  }

  public double getBalance() {
   return balance;
  }
}
