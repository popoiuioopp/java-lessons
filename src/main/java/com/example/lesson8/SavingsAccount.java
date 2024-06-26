package com.example.lesson8;

public class SavingsAccount extends BankAccount {
    
    private double interestRate;

    public SavingsAccount(double value, double interestRate){
        super(value);
        this.interestRate = interestRate;
    }
    
    public void addInterest(){
        double balance = super.getBalance();
        double interest = (balance *(this.interestRate/100));
        super.deposit(interest);
    }

}
