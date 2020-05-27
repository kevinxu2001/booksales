package generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * bookOrder
 * @author 
 */
@Data
public class Bookorder implements Serializable {
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
}