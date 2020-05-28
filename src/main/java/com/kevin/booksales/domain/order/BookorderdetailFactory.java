package com.kevin.booksales.domain.order;

public class BookorderdetailFactory {
    private BookorderdetailFactory(){}

    public static Bookorderdetail createDetail(String id, String orderId, ShopCart shopCart){
        Bookorderdetail bookorderdetail = new Bookorderdetail();
        bookorderdetail.setSerialid(id);
        bookorderdetail.setOrderid(orderId);
        bookorderdetail.setBookid(shopCart.getBookid());
        bookorderdetail.setCount(shopCart.getCount());
        bookorderdetail.setAmount(shopCart.getAmount());

        return bookorderdetail;
    }
}
