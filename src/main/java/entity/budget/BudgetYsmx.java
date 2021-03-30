package entity.budget;

import java.math.BigDecimal;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * 预算编制-预算明细
 * @author linrb
 * @since 2021-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class BudgetYsmx  implements Serializable {

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
     * 类型
     */
    public String lx;

    /**
     * 年份
     */
    public String nf;

    /**
     * 功能科目
     */
    public String gnkm;

    /**
     * 经济科目
     */
    public String jjkm;

    /**
     * 政府经济科目
     */
    public String zfjjkm;

    /**
     * 测算说明
     */
    public String cssm;

    /**
     * 是否政府采购
     */
    public String sfzfcg;

    /**
     * 项目名称
     */
    public String project_name;

    /**
     * 经济分类编码
     */
    public String jjflbm;

    /**
     * 经济分类名称
     */
    public String jjflmc;

    /**
     * 采购品名称
     */
    public String cgpmc;

    /**
     * 采购组织形式
     */
    public String cgzzxs;

    /**
     * 数量
     */
    public BigDecimal sl;

    /**
     * 计量单位
     */
    public String jldw;

    /**
     * 参考单价
     */
    public BigDecimal ckdj;

    /**
     * 总计
     */
    public BigDecimal zj;

    /**
     * 财政拨款
     */
    public BigDecimal czbk;

    /**
     * 行政事业性收费
     */
    public BigDecimal xzsyxsf;

    /**
     * 罚没收入
     */
    public BigDecimal fmsr;

    /**
     * 国有资源（资产）有偿使用收入
     */
    public BigDecimal gyzcycsysr;

    /**
     * 专项收入
     */
    public BigDecimal zxsr;

    /**
     * 其他收入
     */
    public BigDecimal qtsr;

    /**
     * 小计
     */
    public BigDecimal xj;

    /**
     * 政府性基金预算
     */
    public BigDecimal zfxjjys;

    /**
     * 财政专户拨款
     */
    public BigDecimal czzhbk;

    /**
     * 上年结余（结余）
     */
    public BigDecimal snjy;

    /**
     * 中央省拨专款
     */
    public BigDecimal zysbzk;

    /**
     * 其他各项收入
     */
    public BigDecimal qtgxsr;

    /**
     * 国有资本经营预算
     */
    public BigDecimal gyzbjyys;

    /**
     * 支付中心老账户
     */
    public String zfzxlzh;

    /**
     * 单位老账户
     */
    public String dwlzh;

    /**
     * 备注
     */
    public String bz;


}
