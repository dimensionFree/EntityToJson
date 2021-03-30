
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 项目库年度_资金计划表
 * @author linrb
 * @since 2021-03-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class ProjectNdzjjh  {

    public static final long serialVersionUID = 1L;

    /**
     * 自增id
     */

    public Integer id;

    /**
     * 项目id
     */
    public Integer project_id;

    /**
     * 年度
     */
    public String year;

    /**
     * 单位申报数
     */
    public BigDecimal dwsbs;

    /**
     * 部门审核数
     */
    public BigDecimal bmshs;


}
