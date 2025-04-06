package Inheritance;

class Main {
 public static void main(String[] args) {
  BankAccount account = new PersonalAccount(555555555);

  System.out.println(account.getAccountNumber());
 }
}

