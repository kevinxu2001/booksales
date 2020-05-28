package com.kevin.booksales.controller;

import com.kevin.booksales.domain.customer.Customer;
import com.kevin.booksales.domain.membership.Membership;
import com.kevin.booksales.domain.point.Point;
import com.kevin.booksales.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customer", produces = "application/json;charset=utf-8")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "pointlist")
    public ResultMessage pointlist(@RequestParam(value = "id") int customerid){
        List<Point> pointList = customerService.pointList(customerid);
        return ResultMessage.success(pointList);
    }

    @RequestMapping(value = "totalpoint")
    public ResultMessage totalpoint(@RequestParam(value = "id") int customerid){
        int total = customerService.totalPoint(customerid);
        return ResultMessage.success(total);
    }

    @RequestMapping(value = "premium")
    public ResultMessage payForPremium(@RequestParam(value = "id") int id){
        String expire = customerService.payForPremium(id);
        return ResultMessage.success(expire);
    }

}
