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
     * id
     */
    private int id;

    /**
     * 等级名称
     */
    private String leveltitle;

    /**
     * 会员id
     */
    private int customerid;

    /**
     * 折扣
     */
    private int discount;

    /**
     * 创建时间
     */
    private Date createdtime;

    /**
     * 会员过期日期
     */
    private Date expire;

    /**
     * code
     */
    private int levelcode;


    private static final long serialVersionUID = 1L;

    @Override
    public boolean sameInentifyAs(Membership other) {
        return false;
    }
}