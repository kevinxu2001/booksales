package com.kevin.booksales.domain.customer;

import com.kevin.booksales.domain.Entity;
import com.kevin.booksales.domain.membership.Membership;
import com.kevin.booksales.domain.membership.MembershipLevel;
import com.kevin.booksales.domain.membership.MembershipRepository;
import com.kevin.booksales.domain.point.PointRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode(of = {"customerid"})
public class Customer implements Entity<Customer> {

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
    private List<Membership> membershipList;

    /**
     * 是否VIP
     */
    private boolean isVip;

    /**
     * 是否付费用户
     */
    private boolean isPremium;

    /**
     * 总积分
     */
    private int totalPoint;


    public void Memberships(MembershipRepository membershipRepository) {
        List<Membership> membershipList = membershipRepository.selectByCustomerId(this.getCustomerid());
        this.membershipList = membershipList;
    }

    public boolean isVip(MembershipRepository membershipRepository){
        Membership membership = membershipRepository.selectOneByIdAndLevel(this.getCustomerid(), MembershipLevel.VIP.getCode());
        if(membership == null){
            this.isVip = false;
        }else{
            this.isVip = true;
        }
        return this.isVip;
    }
    public boolean isPremium(MembershipRepository membershipRepository){
        Membership membership = membershipRepository.selectOneByIdAndLevel(this.getCustomerid(), MembershipLevel.PREMIUM.getCode());
        if(membership == null){
            this.isPremium = false;
        }else{
            //is expired
            Date today = new Date();
            if(membership.getExpire().getTime() > today.getTime()){
                this.isPremium = true;
            }else{

                this.isPremium = false;
            }
        }
        return this.isPremium;
    }

    public void TotalPoint(){

    }

    @Override
    public boolean sameInentifyAs(Customer other) {
        return false;
    }
}
