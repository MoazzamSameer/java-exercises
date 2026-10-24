package com.amigoscode._2_developers._10_exceptions;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    void withdraw(double amount) throws InsufficientFundsException {
       if (amount > balance){
           throw new InsufficientFundsException("Insufficient balance", amount - balance);       }else {
           this.balance -= amount;
       }

    }

    public double getBalance() {
        return balance;
    }
}
