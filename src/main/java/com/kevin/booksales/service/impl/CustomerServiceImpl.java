package com.kevin.booksales.service.impl;

import com.kevin.booksales.BusinessException;
import com.kevin.booksales.domain.customer.CustomerRepository;
import com.kevin.booksales.domain.customer.Customer;
import com.kevin.booksales.domain.membership.Membership;
import com.kevin.booksales.domain.membership.MembershipFactory;
import com.kevin.booksales.domain.membership.MembershipLevel;
import com.kevin.booksales.domain.membership.MembershipRepository;
import com.kevin.booksales.domain.point.Point;
import com.kevin.booksales.domain.point.PointRepository;
import com.kevin.booksales.service.AppExceptionMessage;
import com.kevin.booksales.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private MembershipRepository membershipRepository;

    @Autowired
    private PointRepository pointRepository;

    @Override
    public Customer selectById(int customerId) {
        return customerRepository.selectByPrimaryKey(customerId);
    }

    @Override
    public List<Membership> memberships(int customerId) {
        Customer customer = customerRepository.selectByPrimaryKey(customerId);
        customer.Memberships(membershipRepository);
        return customer.getMembershipList();
    }

    @Override
    public String payForPremium(int customerId) {
        Customer customer = customerRepository.selectByPrimaryKey(customerId);
        if(customer == null){
            BusinessException.throwException(AppExceptionMessage.CUSTOMER_NOT_EXIST_CODE, AppExceptionMessage.CUSTOMER_NOT_EXIST, customerId);
        }

        //Todo: payment service

        //compute the expire date +12 months
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();

        c.setTime(new Date());
        c.add(Calendar.MONTH, 6);
        Date expireDate = c.getTime();
        String expireStr = format.format(expireDate);

        Membership oldMembership = membershipRepository.selectOneByIdAndLevel(customer.getCustomerid(), MembershipLevel.PREMIUM.getCode());

        if(oldMembership == null){
            Membership membership = MembershipFactory.createMembership(customer, MembershipLevel.PREMIUM);
            membership.setExpire(expireDate);
            membershipRepository.insert(membership);
        }else{
            oldMembership.setExpire(expireDate);
            membershipRepository.updateByPrimaryKey(oldMembership);
        }

        return expireStr;

    }

    @Override
    public int totalPoint(int customerId) {
        Customer customer = customerRepository.selectByPrimaryKey(customerId);
        if(customer == null){
            BusinessException.throwException(AppExceptionMessage.CUSTOMER_NOT_EXIST_CODE, AppExceptionMessage.CUSTOMER_NOT_EXIST, customerId);
        }
        customer.TotalPoint(pointRepository);

        return customer.getTotalPoint();
    }

    @Override
    public List<Point> pointList(int customerId) {
        Customer customer = customerRepository.selectByPrimaryKey(customerId);
        if(customer == null){
            BusinessException.throwException(AppExceptionMessage.CUSTOMER_NOT_EXIST_CODE, AppExceptionMessage.CUSTOMER_NOT_EXIST, customerId);
        }
        return pointRepository.selectAllByCustomerid(customerId);
    }
}
