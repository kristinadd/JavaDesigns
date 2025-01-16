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
  public String toString() {
   return String.format("account: ⭐️ Basic Bank Account, balance: %.2f", balance);
  }
}
  