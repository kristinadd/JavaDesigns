package MiniBankDesign;

public class Main {
  public static void main(String[] args) {
    BankAccount account = new PremiumBankAccount(0);
    Service service = new Service(account);
    MainMenu menu = MainMenu.getInstance(service);
    menu.run();
  }
}


// keep main as clean as possible
