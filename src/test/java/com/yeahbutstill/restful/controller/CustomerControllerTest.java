package com.yeahbutstill.restful.controller;

import com.yeahbutstill.restful.domain.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class CustomerControllerTest {

    @Autowired
    CustomerController customerController;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getAllCustomers() {
        List<Customer> allCustomers = customerController.getAllCustomers();
        assertEquals(2, allCustomers.size());
    }

    @Test
    void getCustomerById() {
        customerController.getCustomerById(1L);
        assertNotNull(customerController.getCustomerById(1L));
    }

    @Test
    void saveCustomer() {
        Customer customer = new Customer();
        customer.setFirstName("PM apa bajai");
        customer.setLastName("Kabur mulu");
        customerController.saveCustomer(customer);
        assertNotNull(customerController.getCustomerById(customer.getId()));
    }
}