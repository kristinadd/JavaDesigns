package CardDistributionSystem.AtomicVersion;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(100);

    Thread depositThread = new Thread(() -> {
      for (int i=0; i<7; i++) {
        account.deposit(30);
        System.out.println(Thread.currentThread().getName() + " 💰 Deposited 30");
      }
    });


    Thread withdrawThread = new Thread(() -> {
      for (int i=0; i<7; i++) {
        account.withdraw(30);
        System.out.println(Thread.currentThread().getName() + " 💸 Withdrew 30");
      }
    });

    // Start both threads
    depositThread.start();
    withdrawThread.start();

    // Wait for both threads to finish
    try {
      depositThread.join();
      withdrawThread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("Final Balance: " + account.getBalance().get());

  }  
}
