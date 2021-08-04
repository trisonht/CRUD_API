package com.example.crud_api.dao;

import java.util.List;
import com.example.crud_api.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface respository extends JpaRepository<Customer, Long> {

}
