package com.example.lesson2;

// Encapsulation
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 5000);
        System.out.println("Initial owner: " + account.getOwner());
        account.deposit(1500);
        account.withdraw(2000);
        System.out.println("Balance: " + account.getBalance());

        // Changing the owner
        account.setOwner("Newer John Doe");
        System.out.println("Updated owner: " + account.getOwner());
    }
}