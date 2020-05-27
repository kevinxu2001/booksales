package com.kevin.booksales.domain.membership;

import com.kevin.booksales.domain.customer.Customer;

public class MembershipFactory {
    private MembershipFactory(){}

    public static Membership createMembership(Customer customer, MembershipLevel level){
        Membership membership = new Membership();
        membership.setCustomerid(customer.getCustomerid());
        membership.setLevelcode(level.getCode());
        membership.setLeveltitle(level.getTitle());
        membership.setDiscount(level.getDiscount());

        return membership;
    }
}
