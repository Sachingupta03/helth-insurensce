package com.sachin.service.impl;

import com.sachin.model.Customer;
import com.sachin.repository.CustomerRepository;
import com.sachin.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer registerCustomer(Customer customer) {
        return customerRepository.save (customer);
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerRepository.findById (id).orElse (null);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll ();
    }

    @Override
    public Customer updateCustomer(int id, Customer customer) {
        Optional<Customer> existingCustomerOpt = customerRepository.findById (id);
        if (existingCustomerOpt.isPresent ()) {
            Customer existingCustomer = existingCustomerOpt.get ();

            existingCustomer.setName (customer.getName ());
            existingCustomer.setAddress (customer.getAddress ());
            existingCustomer.setEmail (customer.getEmail ());
            existingCustomer.setPassword (customer.getPassword ());

            return customerRepository.save (existingCustomer);
        } else {
            return null; // Or throw new ResourceNotFoundException
        }
    }


    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById (id);
    }
}
