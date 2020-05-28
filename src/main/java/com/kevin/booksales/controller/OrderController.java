package com.kevin.booksales.controller;


import com.kevin.booksales.domain.order.Bookorder;
import com.kevin.booksales.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/order", produces = "application/json;charset=utf-8")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "create")
    public ResultMessage info(@RequestParam(value = "id") int customerid){
        //test data
        List<String> shopCartIdList = new ArrayList<>();
        shopCartIdList.add("111");
        shopCartIdList.add("222");

        Bookorder bookorder = orderService.create(customerid, shopCartIdList);
        return ResultMessage.success(bookorder);
    }
}
