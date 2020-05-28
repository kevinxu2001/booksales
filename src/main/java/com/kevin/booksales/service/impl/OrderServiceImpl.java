package com.kevin.booksales.service.impl;

import com.kevin.booksales.BusinessException;
import com.kevin.booksales.domain.customer.Customer;
import com.kevin.booksales.domain.customer.CustomerRepository;
import com.kevin.booksales.domain.membership.Membership;
import com.kevin.booksales.domain.membership.MembershipRepository;
import com.kevin.booksales.domain.order.*;
import com.kevin.booksales.service.AppExceptionMessage;
import com.kevin.booksales.service.OrderService;
import com.kevin.booksales.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    CustomerRepository customerRepository ;

    @Autowired
    MembershipRepository membershipRepository;

    @Autowired
    BookorderRepository bookorderRepository;

    @Autowired
    BookorderdetailRepository bookorderdetailRepository;


    public static final IdGenerator ID_GENERATOR = IdGenerator.INSTANCE;

    @Override
    public Bookorder create(int customerId, List<String> cartidList) {
        //get cart list
        List<ShopCart> shopCartList = this.readShopcart();


        //check customer isPremium
        Customer customer = customerRepository.selectByPrimaryKey(customerId);
        if (!customer.isPremium(membershipRepository) || !customer.isVip(membershipRepository)) {
            BusinessException.throwException(AppExceptionMessage.NORMAL_MEMBER_CAN_NOT_PAY_CODE, AppExceptionMessage.NORMAL_MEMBER_CAN_NOT_PAY, customerId);
        }

        //create bookorder
        BigDecimal amount = new BigDecimal("0");
        for (ShopCart shopCart: shopCartList){
            BigDecimal count = BigDecimal.valueOf((int)shopCart.getCount());
            BigDecimal price = shopCart.getPrice();
            BigDecimal amt = count.multiply(price);
            amount = amount.add(amt);
        }

        Bookorder order = BookorderFactory.creaetOrder(customerId, ID_GENERATOR.nextId(), amount );
        bookorderRepository.insert(order);

        //create bookOrderDetail


        return bookorderRepository.selectByPrimaryKey(order.getOrderid());
    }

    @Override
    public String pay(String orderId) {
        //check order status

        //is vip

        //is premium

        //calculate amount with discount

        //pay

        //gain point

        //success
        return null;
    }

    //for test , build ShopCart list
    public List<ShopCart> readShopcart(){

        List<ShopCart> shopCartList = new ArrayList<>();

        ShopCart shopCart_1 = new ShopCart();
        BigDecimal price_1 = new BigDecimal("12.00");
        shopCart_1.setCartid("cartid-1");
        shopCart_1.setBookid("1");
        shopCart_1.setPrice(price_1);
        shopCart_1.setCount(3);
        shopCart_1.setAmount(new BigDecimal("36.00"));
        shopCartList.add(shopCart_1);


        ShopCart shopCart_2 = new ShopCart();
        BigDecimal price_2 = new BigDecimal("10.00");
        shopCart_2.setCartid("cartid-12");
        shopCart_2.setBookid("2");
        shopCart_2.setPrice(price_2);
        shopCart_2.setCount(4);
        shopCart_2.setAmount(new BigDecimal("40.00"));
        shopCartList.add(shopCart_2);

        return shopCartList;

    }
}
