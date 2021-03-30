package entity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 'zrzyjcznkpt.user_org' is not BASE TABLE
 * @author linrb
 * @since 2021-03-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("zrzyjcznkpt_ysykzxjh")
public class Ysykzxjh implements Serializable {

    public static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
        @TableId(value = "id", type = IdType.AUTO)
    public Integer id;

    /**
     * 项目id
     */
    public Integer project_id;

    /**
     * 项目名称
     */
    public String project_name;

    /**
     * 指标分配年度
     */
    public String zbnf;

    /**
     * 资金性质
     */
    public String zjxz;

    /**
     * 功能分类
     */
    public String gnfl;

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
     * 指标来源
     */
    public String zbly;

    /**
     * 是否符合专项资金用途
     */
    public String sffhzxzjyt;

    /**
     * 是否政府采购
     */
    public String sfzfcg;

    /**
     * 基建合同
     */
    public Integer jjht_id;

    /**
     * 基建合同
     */
    public String jjht;

    /**
     * 支付方式
     */
    public String zffs;

    /**
     * 用款科室
     */
    public String ykks;

    /**
     * 说明
     */
    public String remark;

    /**
     * 指标总金额
     */
    public BigDecimal zbzje;

    /**
     * 指标可用金额
     */
    public BigDecimal zbkyje;

    /**
     * 已申请计划金额
     */
    public BigDecimal ysqjhje;

    /**
     * 项目状态（0为已创建，1为已提交待审核，2为经办科室领导审批不通过，3为经办科室领导审批通过，4为财务科审批不通过，5为财务科审批通过）
     */
    public String status;

    /**
     * 审核人
     */
    public String shrxm;

    /**
     * 审核人id
     */
    public String shrid;

    /**
     * 是否删除（1为删除，默认0）
     */
    public Integer is_del;

    /**
     * 归属区域
     */
    public String belong;

    /**
     * 归属部门
     */
    public String belong_org;

    /**
     * 归属部门id
     */
    public String belong_org_id;

    /**
     * 更新人
     */
    public String updated_by;

    /**
     * 更新人id
     */
    public String updated_by_id;

    /**
     * 创建人
     */
    public String created_by;

    /**
     * 创建人id
     */
    public String created_by_id;

    /**
     * 创建时间
     */
    public Date created_at;

    /**
     * 更新时间
     */
    public Date updated_at;
    /**
     * 预算指标分发明细
     */
    @TableField(exist = false)
    List<YsykzxjhMx> ysykzxjhMxList;

}
