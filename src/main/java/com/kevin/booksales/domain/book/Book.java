package com.kevin.booksales.domain.book;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * book
 * @author 
 */
@Data
public class Book implements Serializable {
    /**
     * id
     */
    private String bookid;

    /**
     * 书名
     */
    private String bookname;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 创建时间
     */
    private Date createdtime;

    private static final long serialVersionUID = 1L;
}