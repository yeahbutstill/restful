package com.yeahbutstill.restful.bootstrap;

import com.yeahbutstill.restful.domain.Customer;
import com.yeahbutstill.restful.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    @Autowired
    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Loading Customer Data");
        Customer c1 = new Customer();
        c1.setFirstName("PM tai");
        c1.setLastName("Kabur mulu");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("PM tai juga");
        c2.setLastName("Jago boong");
        customerRepository.save(c2);

        log.info("Customer saved: {}", customerRepository.count());
    }

}
