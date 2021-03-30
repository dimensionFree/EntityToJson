
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 附件列表
 *
 * @author linrb
 * @since 2021-01-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class CommonFile implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 文件id
     */
    private String id;

    /**
     * 业务模块id
     */
    private Integer business_id;

    /**
     * 业务模块编码(表名)
     */
    private String code;

    /**
     * 文件url
     */
    private String path;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 文件大小
     */
    private String size;

    /**
     * 更新人
     */
    private String updated_by;

    /**
     * 创建人
     */
    private String created_by;

    /**
     * 创建时间
     */
    private Date created_at;

    /**
     * 更新时间
     */
    private Date updated_at;


}
