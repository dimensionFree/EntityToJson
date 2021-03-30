package entity.budget;

import java.math.BigDecimal;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * 预算编制-年度资金计划表
 * @author linrb
 * @since 2021-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class BudgetNdzjjh  implements Serializable {

    public static final long serialVersionUID = 1L;

    /**
     * 自增id
     */

    public Integer id;

    /**
     * 项目id
     */
    public Integer budget_id;

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
