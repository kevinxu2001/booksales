package com.kevin.booksales.controller;

import com.kevin.booksales.domain.customer.Customer;
import com.kevin.booksales.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customer", produces = "application/json;charset=utf-8")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "info")
    public ResultMessage info(@RequestParam(value = "id") int id){
        Customer customer = customerService.selectById(id);
        return ResultMessage.success(customer);
    }

    @RequestMapping(value = "premium")
    public ResultMessage payForPremium(@RequestParam(value = "id") int id){
        String expire = customerService.payForPremium(id);
        return ResultMessage.success(expire);
    }

}
