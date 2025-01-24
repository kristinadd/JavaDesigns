package MiniBankDesign;

public class Main {
  public static void main(String[] args) {
    BankAccount account = new PremiumBankAccount(300);
    Service service = new Service(account);
    MainMenu menu = MainMenu.getInstance(service);
    menu.run();
  }
}
