package com.kevin.booksales.service;

import com.kevin.booksales.domain.order.Bookorder;

import java.util.List;

public interface OrderService {

    Bookorder create(int customerId, List<String> cartList);

    void pay(int customerId, String orderId);
}
