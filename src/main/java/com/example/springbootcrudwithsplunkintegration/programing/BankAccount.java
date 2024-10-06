package com.example.springbootcrudwithsplunkintegration.programing;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount. Deposit must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Withdrawal must be greater than zero.");
        } else {
            System.out.println("Insufficient funds. Withdrawal amount exceeds account balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(100.0);
        System.out.println("Balance after deposit: $" + account.getBalance());

        account.withdraw(50.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
    }
}