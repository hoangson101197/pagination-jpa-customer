package com.codegym.cms.service;

import com.codegym.cms.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Page<Customer> findAllByFirstNameContaining(String first, Pageable pageable);
}