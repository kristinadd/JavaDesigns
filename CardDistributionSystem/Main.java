package CardDistributionSystem;
public class Main {
  public static void main(String[] args) {
    BankAccount account = new BankAccount(100);

    Thread t1 = new Thread(() -> {
      for (int i = 0; i < 7; i++) {
        account.deposit(10);
        System.out.println(" 💰 Deposited to the account.");
      }
    });

    Thread t2 = new Thread(() -> {
      for (int i=0; i< 7; i++) {
        account.withdraw(10);
        System.out.println(" 💸 Withdraw from the account.");
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join(); // main thread is waiting but these can still be concurrent, one is just going to wait for the other to finish
      t2.join(); // main thread is waiting
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(account.getBlance());
  }
}

//  join() 
// ensures the main thread waits for the specified thread to finish execution, but it does not 
// force the threads to run sequentially. Instead, the threads still execute concurrently—the 
// join() only ensures the main thread pauses until both threads are done.

// join() Waits, But Doesn't Control Thread Execution Order:

// When t1.start() and t2.start() are called, both threads start executing concurrently.
// The join() call ensures the main thread (the one executing System.out.println(account.getBalance());) waits until both threads (t1 and t2) finish.
// However, the threads themselves (t1 and t2) run concurrently and can still interfere with each other if they access shared resources.

// Race Conditions Are Still Possible:
// Even with join(), t1 and t2 can execute their operations on the shared account simultaneously.
// This means the methods deposit and withdraw need to be thread-safe to avoid unpredictable results.

// Without synchronization or another thread-safety mechanism, simultaneous access to balance can result in:
// Overwriting Updates: One thread may overwrite the other thread’s update due to non-atomic operations.
// Inconsistent Reads: One thread may read a partially updated value written by another thread.
//  ###########################################################################################
// IT WORKS BUT IT LOCKS
// Why This Fix Works
// Synchronized Methods:

// The synchronized keyword ensures that only one thread at a time can execute a synchronized method on the same object (account).
// While one thread is executing a synchronized method (e.g., deposit), any other thread trying to execute another synchronized method 
// (e.g., withdraw) on the same object will block until the first thread finishes.

// Prevent Race Conditions:
// By locking access to the balance, threads cannot interfere with each other’s updates.

// Key Takeaway
// Even though join() ensures the main thread waits for both threads to complete, it does not serialize the execution of t1 and t2. 
// They still run concurrently, and thread safety must be explicitly implemented to avoid race conditions. Use synchronized methods 
// or other mechanisms like locks or atomic variables to ensure correct behavior.

