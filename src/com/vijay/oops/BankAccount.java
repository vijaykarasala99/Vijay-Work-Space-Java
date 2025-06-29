package com.vijay.oops;

public class BankAccount {

    private double balance;

   
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(300);
        account.withdraw(800); // Should show insufficient balance

        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
