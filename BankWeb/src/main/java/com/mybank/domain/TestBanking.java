package com.mybank.domain;

public class TestBanking {

    public static void main(String[] args) {
        
        
        Bank.addCustomer("Jane", "Simms");
        Bank.addCustomer("Owen", "Bryant");
        Bank.addCustomer("Tim", "Soley");
        Bank.addCustomer("Maria", "Soley");
        
        for ( int i = 0; i < Bank.getNumOfCustomers(); i++ ) {
            Customer customer = Bank.getCustomer(i);
            
            System.out.println("Customer [" + (i+1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
    
}
