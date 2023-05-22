
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AccountManagementHashmap{
    private Map<String, Account> accounts;
    private Scanner scanner;

    public AccountManagementHashmap() {
        accounts = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Account Management System ===");
            System.out.println("1. Create an account");
            System.out.println("2. Delete an account");
            System.out.println("3. Save account details");
            System.out.println("4. View an account");
            System.out.println("5. View all accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deleteAccount();
                    break;
                case 3:
                    saveAccountDetails();
                    break;
                case 4:
                    viewAccount();
                    break;
                case 5:
                    viewAllAccounts();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void createAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();

        if (accounts.containsKey(accountNumber)) {
            System.out.println("An account with the given account number already exists.");
        } else {
            System.out.print("Enter account holder name: ");
            String accountHolderName = scanner.next();

            System.out.print("Enter account balance: ");
            double balance = scanner.nextDouble();

            Account account = new Account(accountNumber, accountHolderName, balance);
            accounts.put(accountNumber, account);

            System.out.println("Account created successfully.");
        }
    }

    private void deleteAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();

        if (accounts.containsKey(accountNumber)) {
            accounts.remove(accountNumber);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private void saveAccountDetails() {
        // Implement the logic to save account details to a file or database
        System.out.println("Account details saved successfully.");
    }

    private void viewAccount() {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();

        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            System.out.println("\nAccount Details");
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Account Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    private void viewAllAccounts() {
        System.out.println("\nAll Accounts");

        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (Account account : accounts.values()) {
                System.out.println("--------------------");
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("Account Holder Name: " + account.getAccountHolderName());
                System.out.println("Account Balance: " + account.getBalance());
            }
        }
    }

    public static void main(String[] args) {
       
        AccountManagementHashmap accountManagementSystem = new AccountManagementHashmap();
        accountManagementSystem.run();
    }
}

class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}