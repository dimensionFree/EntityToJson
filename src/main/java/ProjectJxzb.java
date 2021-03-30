
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 项目库_绩效指标表
 * @author linrb
 * @since 2021-03-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class ProjectJxzb  {

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
