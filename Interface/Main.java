package Interface;

public class Main {
  public static void main(String[] args) {
    BankAccount account = new PersonalAccount();
    System.out.println(account.getAccountNumber());
  }
  
}
