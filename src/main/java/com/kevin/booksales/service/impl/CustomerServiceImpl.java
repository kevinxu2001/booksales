package com.kevin.booksales.service.impl;

import com.kevin.booksales.domain.customer.CustomerRepository;
import com.kevin.booksales.domain.customer.Customer;
import com.kevin.booksales.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer selectById(int customerId) {
        return customerRepository.selectByPrimaryKey(customerId);
    }

    @Override
    public int payForPremium(int customerId) {
        Customer customer = customerRepository.selectByPrimaryKey(customerId);
        return 0;

    }
}
