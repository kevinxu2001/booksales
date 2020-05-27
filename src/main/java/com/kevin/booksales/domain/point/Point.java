package com.kevin.booksales.domain.point;

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
public class Point implements Entity<Point> {
    /**
     * id
     */
    private String serialid;

    /**
     * 会员id
     */
    private Integer customerid;

    /**
     * 行为code
     */
    private Integer actioncode;

    /**
     * 积分数
     */
    private Integer point;

    /**
     * 创建时间
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;

    @Override
    public boolean sameInentifyAs(Point other) {
        return false;
    }
}