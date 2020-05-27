package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * membership
 * @author 
 */
@Data
public class Membership implements Serializable {
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
}