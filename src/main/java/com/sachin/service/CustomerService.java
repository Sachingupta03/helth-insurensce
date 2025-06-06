package com.sachin.service;


import com.sachin.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer registerCustomer(Customer customer);

    Customer getCustomerById(int id);

    List<Customer> getAllCustomers();

    Customer updateCustomer(int id, Customer customer);

    void deleteCustomer(int id);}
