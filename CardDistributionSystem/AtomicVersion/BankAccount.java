package CardDistributionSystem.AtomicVersion;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAccount {
  private AtomicInteger balance;

  public BankAccount(int balance) {
    this.balance = new AtomicInteger(balance);
  }

  public void deposit(int amount) {
    balance.addAndGet(amount);
  }

  public void withdraw(int amount) {
    balance.addAndGet(- amount);
  }

  public AtomicInteger getBalance() {
    return balance;
  }
}
