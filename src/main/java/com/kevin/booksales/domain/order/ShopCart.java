package com.kevin.booksales.domain.order;

import com.kevin.booksales.domain.Entity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ShopCart implements Entity<ShopCart> {

    /**
     * id
     */
    private String cartid;

    /**
     * 订单id
     */
    private String customerid;

    /**
     * 电子书id
     */
    private String bookid;

    /**
     * 单价
     */
    private BigDecimal price;

    /**
     * 总金额
     */
    private BigDecimal amount;

    /**
     * 件数
     */
    private int count;

    /**
     * 创建时间
     */
    private Date createdtime;


    @Override
    public boolean sameInentifyAs(ShopCart other) {
        return false;
    }
}
