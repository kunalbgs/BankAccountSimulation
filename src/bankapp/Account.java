package bankapp;

import java.util.ArrayList;

/**
 * Represents a bank account with basic operations like deposit, withdrawal,
 * and transaction history tracking.
 */
public class Account {

    private String accountHolder; // Name of the account holder
    private String accountNumber; // Unique account number
    private double balance; // Current account balance
    private ArrayList<String> transactionHistory; // List to store transaction records

    /**
     * Constructor to initialize account details and starting balance.
     */
    public Account(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.transactionHistory = new ArrayList<>();

        if (initialBalance >= 0) {
            this.balance = initialBalance;
            transactionHistory.add("Account created with initial balance: ₹" + initialBalance);
        } else {
            this.balance = 0;
            transactionHistory.add("Account created with invalid initial balance. Set to ₹0.");
        }
    }

    /**
     * Deposits a valid amount into the account.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: ₹" + amount);
        } else {
            transactionHistory.add("Invalid deposit attempt: ₹" + amount);
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Withdraws a valid amount from the account if sufficient balance exists.
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            transactionHistory.add("Invalid withdrawal attempt: ₹" + amount);
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            transactionHistory.add("Failed withdrawal: ₹" + amount + " (Insufficient balance)");
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrew: ₹" + amount);
        }
    }

    /**
     * Returns the current account balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Prints the transaction history for the account.
     */
    public void printTransactionHistory() {
        System.out.println("\nTransaction History for " + accountHolder + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}