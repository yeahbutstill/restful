package com.yeahbutstill.restful.service;

import com.yeahbutstill.restful.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    Customer findCustomerById(Long id);
    List<Customer> findAllCustomers();

}
