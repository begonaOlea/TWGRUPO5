package com.mybank.domain;

public class Bank {
  private static Customer[] customers;
  private static int        numberOfCustomers;

  static {
    customers = new Customer[10];
    numberOfCustomers = 0;
    
    Bank.addCustomer("Jane", "Simms");
    Customer customer = Bank.getCustomer(0);
    customer.addAccount(new SavingsAccount(500.00, 0.05));
    customer.addAccount(new CheckingAccount(200.00, 500.00));
    Bank.addCustomer("Owen", "Bryant");
    customer = Bank.getCustomer(1);
    customer.addAccount(new SavingsAccount(200.00, 0.03));
    
  }

  private Bank() {
    // this constructor should never be called
  }

  public static void addCustomer(String f, String l) {
    int i = numberOfCustomers++;
    customers[i] = new Customer(f, l);
  }
  public static int getNumOfCustomers() {
    return numberOfCustomers;
  }
  public static Customer getCustomer(int customer_index) {
    return customers[customer_index];
  }
}
