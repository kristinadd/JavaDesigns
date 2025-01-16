package CardDistributionSystem;
public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(100);

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 10; i++) {
        account.deposit(10);
        System.out.println(" 💰 Deposited to the account.");
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i=0; i< 10; i++) {
        account.withdraw(10);
        System.out.println(" 💸 Withdraw from the account.");
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join(); // Wait for t1 to finish
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(account.getBlance());
  }
}
