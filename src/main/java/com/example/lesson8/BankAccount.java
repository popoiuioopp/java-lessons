package com.example.lesson8;

public class BankAccount {
    private double balance;

    public BankAccount(double value){
        this.balance = value;
    }

    public void deposit(double value){
        if (value < 0){
            return;
        }
        else{
        this.balance = this.balance + value;
        }
    }

    public void withdraw(double value){
        if (value > balance || value < 0){
            return;
        }
        else{
        this.balance = this.balance - value;
        }
    }

    public double getBalance(){
        return this.balance;
    }
}
