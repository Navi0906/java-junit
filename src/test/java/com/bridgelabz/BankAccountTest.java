package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {

    @Test
    void depositTenGrand(){
        BankAccount acc = new BankAccount();
        assertEquals("Successful!", acc.deposit(10000.00));
    }

    @Test
    void withdrawalTenGrand(){
        BankAccount acc = new BankAccount();
        assertEquals("Successful!", acc.withdraw(10000.00));
    }

    @Test
    void withdrawalMillion(){
        BankAccount acc = new BankAccount();
        assertEquals("Fail! Insufficient Funds.", acc.withdraw(1000000.00));
    }


    @Test
    void checkBalance(){
        BankAccount acc = new BankAccount();
        acc.deposit(1000000.00);
        acc.withdraw(1234);
        assertEquals(1098766.00, acc.getBalance());
    }
}
