package com.kevin.booksales.controller;


import com.kevin.booksales.domain.order.Bookorder;
import com.kevin.booksales.service.OrderService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/order", produces = "application/json;charset=utf-8")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @ApiOperation(value="图书购买-生成订单", notes="图书购买-生成订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
    })
    @RequestMapping(value = "create", method = {RequestMethod.GET})
    public ResultMessage create(@RequestParam(value = "id") int customerid){
        //test data
        List<String> shopCartIdList = new ArrayList<>();
        shopCartIdList.add("111");
        shopCartIdList.add("222");

        Bookorder bookorder = orderService.create(customerid, shopCartIdList);
        return ResultMessage.success(bookorder);
    }

    @ApiOperation(value="图书购买-支付订单", notes="图书购买-支付订单")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int"),
            @ApiImplicitParam(name = "orderid", value = "订单ID", required = true, dataType = "String"),
    })
    @RequestMapping(value = "pay", method = {RequestMethod.GET})
    public ResultMessage pay(@RequestParam(value = "id") int customerid, @RequestParam(value = "orderid") String orderid){

        orderService.pay(customerid, orderid);
        return ResultMessage.success();

    }
}
