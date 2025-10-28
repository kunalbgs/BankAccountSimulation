package bankapp;

import java.util.Scanner;

/**
 * Main class to simulate user interaction with the bank account.
 */
public class BankApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect account holder details
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine().trim();

        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Please enter again: ");
            name = scanner.nextLine().trim();
        }

        System.out.print("Enter account number: ");
        String accNumber = scanner.nextLine().trim();

        while (accNumber.isEmpty()) {
            System.out.print("Account number cannot be empty. Please enter again: ");
            accNumber = scanner.nextLine().trim();
        }

        // Collect initial deposit with validation
        System.out.print("Enter initial deposit amount: ₹");
        double initialDeposit = 0;
        while (true) {
            if (scanner.hasNextDouble()) {
                initialDeposit = scanner.nextDouble();
                if (initialDeposit >= 0) {
                    break;
                } else {
                    System.out.print("Initial deposit must be non-negative. Try again: ₹");
                }
            } else {
                System.out.print("Invalid input. Enter a valid number: ₹");
                scanner.next(); // Clear invalid input
            }
        }

        // Create account object
        Account account = new Account(name, accNumber, initialDeposit);

        boolean running = true;
        while (running) {
            // Display menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            int choice = 0;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                scanner.next(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.printf("Current Balance: ₹%.2f\n", account.getBalance());
                    break;

                case 4:
                    account.printTransactionHistory();
                    break;

                case 5:
                    running = false;
                    System.out.println("Thank you for using the Bank App!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 5.");
            }
        }

        scanner.close();
    }
}