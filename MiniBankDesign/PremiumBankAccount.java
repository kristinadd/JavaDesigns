package MiniBankDesign;

public class PremiumBankAccount implements BankAccount {
  private double balance;

  public PremiumBankAccount(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  @Override
  public String toString() {
    return String.format("account: 💫 Premium Bank Account, balance: %.2f", balance);
  }
}

