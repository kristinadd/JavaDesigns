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

// join() is not related to ensuring that the operations are processed in a synchronized manner. 
// Instead, join() ensures that the main thread waits for the other threads to finish before proceeding 
// to the next steps, like printing the final balance.

// Key Clarifications
// Thread-Safety with Atomic Variables:

// Since the balance variable in BankAccount is an AtomicInteger, it already provides thread-safe operations. 
// The deposit and withdraw methods are atomic, meaning multiple threads can safely access and modify the 
// balance without race conditions.
// You do not need join() to ensure thread safety because AtomicInteger handles that for you.

// Why Use join()?
// Without join(), the main thread does not wait for the depositThread and withdrawThread to complete. 
// As a result, the final balance might be printed while the threads are still running, leading to an 
// incomplete or intermediate result.
// join() ensures that the main thread waits until both threads finish, so the final balance reflects 
// the result after all deposits and withdrawals are processed.

// Even with join(), the threads (depositThread and withdrawThread) run concurrently. Their execution 
// order is determined by the thread scheduler and is not sequential.

// Summary
// join() ensures proper program flow: It guarantees that the main thread waits for the worker threads (depositThread and withdrawThread) to complete before moving forward.
// AtomicInteger ensures thread safety: It guarantees that operations on balance are atomic, even when performed concurrently by multiple threads.
// Without join(), thread safety is still maintained, but the final balance might not be accurate when printed, as the threads could still be running.
// So, join() is not about synchronization of operations but about ensuring all threads finish before you continue executing the main thread logic.