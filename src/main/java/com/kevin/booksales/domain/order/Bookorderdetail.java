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
public class Bookorderdetail implements Entity<Bookorderdetail> {
    /**
     * id
     */
    private String serialid;

    /**
     * 订单id
     */
    private String orderid;

    /**
     * 电子书id
     */
    private String bookid;

    /**
     * 总金额
     */
    private BigDecimal amount;

    /**
     * 件数
     */
    private Integer count;

    /**
     * 创建时间
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean sameInentifyAs(Bookorderdetail other) {
        return false;
    }
}