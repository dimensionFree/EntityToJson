package entity.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 'zrzyjcznkpt.user_org' is not BASE TABLE
 * @author linrb
 * @since 2021-03-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("zrzyjcznkpt_ysykzxjh_mx")
public class YsykzxjhMxVO implements Serializable {

    public static final long serialVersionUID = 1L;
    /**
     * 项目名称
     */
    public String project_name;
    /**
     * 项目分类
     */
    public String xmlb;
    /**
     * 经济分类
     */
    public String jjfl;
    /**
     * 政府经济分类
     */
    public String zfjjfl;

    /**
     * 计划月份
     */
    public String jhyf;

    /**
     * 计划金额（元）
     */
    public BigDecimal jhje;

    /**
     * 用款科室
     */
    public String ykks;

    /**
     * 指标来源
     */
    public String zbly;

    /**
     * 指标分配年度
     */
    public String zbnf;






}
