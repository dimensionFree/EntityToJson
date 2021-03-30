package entity.budget;

import java.math.BigDecimal;


import java.util.Date;

import java.io.Serializable;
import java.util.List;

import entity.ReturnFileVO;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * 预算编制
 * @author linrb
 * @since 2021-03-23
 */
@Data
@EqualsAndHashCode(callSuper = false)

public class Budget implements Serializable {

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
     * 项目名称
     */
    public String project_name;

    /**
     * 项目来源
     */
    public String source;

    /**
     * 项目起始年度
     */
    public String syear;

    /**
     * 项目终止年度
     */
    public String eyear;

    /**
     * 存续状态
     */
    public String cxzt;

    /**
     * 申报属性
     */
    public String sbsx;

    /**
     * 审批权限
     */
    public String spqx;

    /**
     * 是否追踪
     */
    public String sfzz;

    /**
     * 是否科研项目
     */
    public String sfkyxm;

    /**
     * 是否为债券项目
     */
    public String sfzqxm;

    /**
     * 分配方式
     */
    public String fpfs;

    /**
     * 是否信息化项目
     */
    public String sfxxhxm;

    /**
     * 是否省级财政涉农资金
     */
    public String sfsjczsnzj;

    /**
     * 是否基建项目
     */
    public String sfjjxm;

    /**
     * 是否政府采购
     */
    public String sfzfcg;

    /**
     * 是否纳入绩效重点管理范围
     */
    public String sfnrjxzdglfw;

    /**
     * 社会投入资金
     */
    public BigDecimal shtrzj;

    /**
     * 上一年项目预算安排情况
     */
    public BigDecimal synxmysapqk;

    /**
     * 当年金额
     */
    public BigDecimal dnje;

    /**
     * 项目金额（单位：元）
     */
    public BigDecimal xmje;

    /**
     * 申报单位
     */
    public String sbdw;

    /**
     * 用款单位
     */
    public String ykdw;

    /**
     * 设立依据及申报理由
     */
    public String slyjjsbly;

    /**
     * 项目描述
     */
    public String xmms;

    /**
     * 项目状态（0为已创建，1为已提交待审核，2为经办科室领导审批不通过，3为经办科室领导审批通过，4为局分管领导审批不通过，5为局分管领导审批通过，6为财务科审批不通过，7为财务科审批通过，8为局党组会审批不通过，9为局党组会审批通过）
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
     * 总体绩效目标
     */
    public String ztjxmb;

    /**
     * 年度绩效目标
     */
    public String ndjxmb;

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

    /*
     *绩效指标
     */
    
    public List<BudgetJxzb> BudgetJxzb;

    /*
     *年度资金计划
     */
    
    public List<BudgetNdzjjh> BudgetNdzjjh;

    /*
     *预算编制-预算明细
     */
    
    public List<BudgetYsmx> BudgetYsmx;
    /**
     * 文件列表
     */
    
    public List<ReturnFileVO> fileVOList;
}
