package com.app.hotell.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.hotell.Entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    
}