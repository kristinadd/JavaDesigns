package Inheritance;

class Main {
 public static void main(String[] args) {
  BankAccount account = new PersonalAccount(555555555);
  System.out.println(account.getAccountNumber());



  // // // // // // // // // // // // // // // // // // // // // // // // // // // //
  SavingsAccount saveAccount = new SavingsAccount();
  System.out.println(saveAccount.getAccountNumber());
  saveAccount.fun();
  // If a subclass inherits a public method from a superclass,
  // then that method can be called on the subclass instance,
  // no matter what the reference type is (superclass or subclass).

  BankAccount saveAccountSuper = new SavingsAccount();
  // The method fun() is undefined for the type BankAccountJava(67108964)
  // saveAccountSuper.fun();

  // ^
  // The compiler uses the reference type (not the actual object type)
  // to determine which methods are allowed to be called.

  // When calling a method in Java, the compiler checks the reference type and looks up the method in that class and all of its superclasses (up the inheritance chain).
  // If the method exists anywhere in that chain, it's callable.



 System.out.println("======================================================");


 SavingsAccount myAccount = new SavingsAccount();
  System.out.println(myAccount.getBalance());

 }
}
