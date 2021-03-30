package entity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class YsykzxjhMx implements Serializable {

    public static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
        @TableId(value = "id", type = IdType.AUTO)
    public Integer id;

    /**
     * 预算用款执行计划id
     */
    public Integer ysykzxjh_id;

    /**
     * 计划月份
     */
    public String jhyf;

    /**
     * 计划金额（元）
     */
    public BigDecimal jhje;


}
