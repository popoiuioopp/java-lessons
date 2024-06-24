package com.example.lesson2;

public class BankAccount {
    // Attributes
    private String owner;
    private double balance;

    public BankAccount(String inputOwner, double inputBalance) {
        this.owner = inputOwner;
        this.balance = inputBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        if (owner != null && !owner.isEmpty()) {
            this.owner = owner;
        }
    }
}