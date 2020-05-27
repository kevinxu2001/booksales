package com.kevin.booksales.service;

import com.kevin.booksales.domain.customer.Customer;

public interface CustomerService {

    Customer selectById(int customerId);

    String payForPremium(int customerId);

}
