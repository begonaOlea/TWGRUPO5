package com.mybank.domain;

public class Account {
    
    protected double balance;
    
    protected Account(double initBalance) {
        balance = initBalance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amt) {
        balance = balance + amt;
    }
    
    public void withdraw(double amt) throws OverdraftException {
        boolean result = false;  // assume operation failure
        if ( amt <= balance ) {
            balance = balance - amt;
        } else {
            throw new OverdraftException("Insufficient funds", amt - balance);
        }
    }
}
