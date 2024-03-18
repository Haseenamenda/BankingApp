package com.example.SimpleBankApp.service;

import com.example.SimpleBankApp.dao.CustomerDAO;
import com.example.SimpleBankApp.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }

    public void addCustomer(Customer customer) {
        customerDAO.save(customer);
    }

    public Customer getCustomerById(Long id) {
        return customerDAO.findById(id).orElseThrow(() -> new RuntimeException("Customer ID is invalid"));
    }

    public void deleteCustomerById(Long id) {
        Customer customer = customerDAO.findById(id).orElse(null);
        if (customer != null) {
            customerDAO.deleteById(id);
        } else {
            throw new RuntimeException("Customer ID is invalid");
        }
    }

}
