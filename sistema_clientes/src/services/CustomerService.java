package services;

import java.util.HashMap;
import java.util.Map;

import models.Customer;

public class CustomerService {
    private final Map<String, Customer> customers;

    public CustomerService() {
        customers =  new HashMap<>();
    }
        
    public void registerCustomer(Customer customer){
        customers.put(customer.customerId(), customer);
    }

    public boolean updateEmail(String customerId, String newEmail){
        Customer customer = findCustomer(customerId);
        if (customer == null) {
            return false;
        }

        Customer updateCustomer = new Customer(customer.customerId(), customer.fullName(), newEmail);
        customers.put(customerId, updateCustomer);
        return true;
    }

    public Customer findCustomer(String customerId){
        return customers.get(customerId);
    }

    public boolean existsCustomer(String customerId){
        return customers.containsKey(customerId);
    }

    public Customer removeCustomer(String customerId){
        return customers.remove(customerId);
    }

    public void showAllCustomers (){
        if (customers.isEmpty()) {
            System.out.println("No existen clientes.");
            return ;
        }

        customers.forEach((key, customer) -> System.out.println(key + " -> " + customer));
    }

    public int totalCustomers(){
        return customers.size();
    }
}
