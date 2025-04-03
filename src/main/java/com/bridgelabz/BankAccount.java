package com.bridgelabz;

public class BankAccount {
    private double balance = 100000.00;

    String deposit(double amount){
        balance = balance+amount;
        return "Successful!";
    }

    String withdraw(double amount){
        if(amount>balance){
            return "Fail! Insufficient Funds.";
        }
        balance = balance - amount;
        return "Successful!";
    }

    double getBalance(){
        return balance;
    }
}
