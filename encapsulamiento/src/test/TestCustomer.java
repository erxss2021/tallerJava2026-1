package test;

import clases.Customer;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Eloy", "o@o");
        customer.showInformation();
        Customer customer2 = new Customer("A", "q@o");
        customer2.showInformation();
    }
}
