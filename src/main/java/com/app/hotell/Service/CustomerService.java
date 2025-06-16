package com.app.hotell.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.hotell.Entity.Customer;
import com.app.hotell.Repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepo;

    public Page<Customer> getAllCustomers(Pageable pageable) {
    return customerRepo.findAll(pageable);
}

    public Customer createCustomer(Customer customer){
        return customerRepo.save(customer);
    }

    public Customer getCustomer(Long id){
        return customerRepo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    public List<Customer> getAllCustomer(){
        return customerRepo.findAll();
    }

    public Customer updateCustomer(Long id, Customer updatedCustomer){
        Customer existing = getCustomer(id);
        existing.setName(updatedCustomer.getName());
        existing.setEmail(updatedCustomer.getEmail());
        existing.setPhoneno(updatedCustomer.getPhoneno());
        existing.setAddress(updatedCustomer.getAddress());
        return customerRepo.save(existing);
    }

    public void deleteCustomer(Long id) {
        customerRepo.deleteById(id);
    }
}