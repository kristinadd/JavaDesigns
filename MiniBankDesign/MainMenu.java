package MiniBankDesign;

import java.util.Scanner;

public class MainMenu {
  private static MainMenu instance;
  private Scanner scanner = new Scanner(System.in);
  private Service service;

  private MainMenu(Service service) {
    this.service = service;
  }

  public static MainMenu getInstance(Service service) {
    instance = new MainMenu(service);
    return instance;
  }

  public void run() {
    while (true) {
      menu();
      int choice = scanner.nextInt();
      switch (choice) {
        case 1:
          System.out.println(service.getBalance());
          break;
        case 2:
        System.out.println("💰 Please enter the amount you would like to deposit:");
        int amount = scanner.nextInt();
          service.deposit(amount);
          break;
        case 3:
        System.out.println("💸 Please enter the amount you would like to withdraw:");
        amount = scanner.nextInt();
          service.withdraw(amount);
          break;
        case 4:
          return;
        default:
        System.out.println("❌ Invalid choice. Please select a valid option.");
      }
    }
  }

  public void menu() {
      String[]  options = {
      "View Account Balance",
      "Deposit Cash",
      "Withdraw Cash",
      "Exit"
    };

    System.out.println("🏧 Please choose one of the following options. 🏧");
    for (int i=0; i<options.length; i++) {
      System.out.printf("%d: %s%n", i + 1, options[i]);
    }
  }
}

// I wan to make it a Singleton since this class shoudn't be instantiated more than once.
// I need to have the main menu just once. 
