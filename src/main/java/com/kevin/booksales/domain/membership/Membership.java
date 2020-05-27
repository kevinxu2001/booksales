package com.kevin.booksales.domain.membership;

import java.math.BigDecimal;
import java.util.Date;

import com.kevin.booksales.domain.Entity;
import lombok.Data;

/**
 * book
 * @author 
 */
@Data
public class Membership implements Entity<Membership> {
    /**
     * code
     */
    private Integer levelcode;

    /**
     * 等级名称
     */
    private String leveltitle;

    /**
     * 会员id
     */
    private Integer customerid;

    /**
     * 折扣
     */
    private Integer discount;

    /**
     * 创建时间
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean sameInentifyAs(Membership other) {
        return false;
    }
}