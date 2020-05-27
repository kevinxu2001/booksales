package generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * bookOrderDetail
 * @author 
 */
@Data
public class Bookorderdetail implements Serializable {
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
}