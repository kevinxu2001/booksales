package com.kevin.booksales.service;

import com.kevin.booksales.domain.customer.Customer;
import com.kevin.booksales.domain.membership.Membership;
import com.kevin.booksales.domain.point.Point;

import java.util.List;

public interface CustomerService {

    Customer selectById(int customerId);

    List<Membership> memberships(int customerId);

    String payForPremium(int customerId);

    int totalPoint(int customerId);

    List<Point> pointList(int getCustomerId);

}
