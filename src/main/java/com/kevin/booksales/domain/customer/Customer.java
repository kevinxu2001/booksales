package com.kevin.booksales.domain.customer;

import com.kevin.booksales.domain.Entity;
import com.kevin.booksales.domain.membership.Membership;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Data
public class Customer implements Entity<Customer> {

    @Autowired
    private Membership membership;

    /**
     * id
     */
    private Integer customerid;

    /**
     * 姓名
     */
    private String name;

    /**
     * 创建时间
     */
    private Date createdtime;

    /**
     * 会员权益
     */
    List<Membership> membershipList;

    public void payForPremium(){

    }


    @Override
    public boolean sameInentifyAs(Customer other) {
        return false;
    }
}
