package com.kevin.booksales.domain.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.kevin.booksales.domain.Entity;
import com.kevin.booksales.domain.membership.Membership;
import lombok.Data;
import org.springframework.util.Assert;

/**
 * book
 * @author 
 */
@Data
public class Bookorder implements Entity<Bookorder> {
    /**
     * 订单id
     */
    private String orderid;

    /**
     * 会员id
     */
    private Integer customerid;

    /**
     * 折扣前订单金额
     */
    private BigDecimal amount;

    /**
     * 折扣
     */
    private Integer discount;

    /**
     * 真实付款金额
     */
    private BigDecimal realpaid;

    /**
     * 0,未支付；
     1，已支付；
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createdtime;



    private static final long serialVersionUID = 1L;

    @Override
    public boolean sameInentifyAs(Bookorder other) {
        return false;
    }

    public void pay(BigDecimal realpaid, int discount){

        Assert.isTrue(realpaid.intValue() > 0, "The amount must be bigger than 0.");
        this.realpaid = realpaid;
        this.discount = discount;
        this.status = OrderStatus.PAID.getCode();

    }

}