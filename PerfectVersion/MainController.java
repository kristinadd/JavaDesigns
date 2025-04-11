package PerfectVersion;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Scanner;

import PerfectVersion.AccountFactory.AccountType;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountService service = new AccountService();

        System.out.println("Select Account Type (0 = Personal, 1 = Savings): ");
        int type = scanner.nextInt();
        System.out.println("Enter account number:");
        int accNumber = scanner.nextInt();
        scanner.nextLine();

        BankAccount account = AccountFactory.create(
            type == 0 ? AccountType.PERSONAL : AccountType.SAVINGS,
            accNumber,
            Currency.getInstance("USD")
        );

        service.create(account);
        System.out.println("Account Created: " + account.getId());

        System.out.println("Enter amount to deposit:");
        BigDecimal depositAmount = scanner.nextBigDecimal();
        account.deposit(depositAmount);
        service.update(account);

        System.out.println("Balance: " + account.getBalance());
    }
}
