package com.example.lesson8;

public class Main {
    
    public static void main(String[] args){

        // BankAccount bank1 = new BankAccount(1000);
        // System.out.println(bank1.getBalance());
        // bank1.deposit(1000);
        // System.out.println(bank1.getBalance());
        // bank1.withdraw(1500);
        // System.out.println(bank1.getBalance());


        SavingsAccount saving1 = new SavingsAccount(100, 3);
        System.out.println(saving1.getBalance());
        saving1.addInterest();
        System.out.println(saving1.getBalance());
        saving1.addInterest();
        System.out.println(saving1.getBalance());

    }

}
