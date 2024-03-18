package com.example.SimpleBankApp.dao;

import com.example.SimpleBankApp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, Long> {
}
