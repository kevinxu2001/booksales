package com.kevin.booksales.domain.order;


import java.math.BigDecimal;

public class BookorderFactory {

    private  BookorderFactory(){}

    public static Bookorder creaetOrder(int customerId, String orderId, BigDecimal amount){
        Bookorder bookorder = new Bookorder();
        bookorder.setOrderid(orderId);
        bookorder.setCustomerid(customerId);
        bookorder.setAmount(amount);
        bookorder.setStatus(OrderStatus.CREATED.getCode());

        return bookorder;
    }
}
