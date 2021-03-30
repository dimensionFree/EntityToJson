package entity.budget;


import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * 预算编制-绩效指标表
 * @author linrb
 * @since 2021-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class BudgetJxzb  implements Serializable {

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
     * 父指标名称
     */
    public String parent_zbmc;

    /**
     * 二级指标名称
     */
    public String ejzbmc;

    /**
     * 三级指标名称
     */
    public String sjzbmc;

    /**
     * 指标值
     */
    public String zbz;


}
