package com.kevin.booksales.domain.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.kevin.booksales.domain.Entity;
import lombok.Data;

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
     * 创建时间
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean sameInentifyAs(Bookorder other) {
        return false;
    }
}