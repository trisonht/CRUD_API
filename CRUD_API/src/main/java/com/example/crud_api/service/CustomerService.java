package com.example.crud_api.service;

import com.example.crud_api.Models.Customer;

import java.util.List;
import java.util.Set;
public interface CustomerService {
    public List<Customer> listAll();

    public Customer Create(Customer theEmployee);

    public Customer getById(Long id);

    public Customer save(Customer theEmployee);

    public void deletebyId(Long theId);
}
