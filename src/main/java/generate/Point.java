package generate;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * point
 * @author 
 */
@Data
public class Point implements Serializable {
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
}