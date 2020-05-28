package com.kevin.booksales.controller;

import com.kevin.booksales.domain.point.Point;
import com.kevin.booksales.service.CustomerService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customer", produces = "application/json;charset=utf-8")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @ApiOperation(value="用户付费成为付费会员", notes="用户付费成为付费会员")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
    })
    @RequestMapping(value = "paypremium", method = {RequestMethod.GET})
    public ResultMessage payForPremium(@RequestParam(value = "id") int id){
        String expire = customerService.payForPremium(id);
        return ResultMessage.success(expire);
    }

    @ApiOperation(value="查询积分-列表", notes="查询积分-列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
    })
    @RequestMapping(value = "pointlist", method = {RequestMethod.GET})
    public ResultMessage pointlist(@RequestParam(value = "id") int customerid){
        List<Point> pointList = customerService.pointList(customerid);
        return ResultMessage.success(pointList);
    }

    @ApiOperation(value="查询积分-总积分", notes="查询积分-总积分")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "int")
    })
    @RequestMapping(value = "totalpoint", method = {RequestMethod.GET})
    public ResultMessage totalpoint(@RequestParam(value = "id") int customerid){
        int total = customerService.totalPoint(customerid);
        return ResultMessage.success(total);
    }

}
