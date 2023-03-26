package top.moon.imiao.pojo.permission.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * 权限表
 *
 * @TableName imiao_permission
 */
@Data
public class Permission implements Serializable {

    /**
     * 权限ID
     */
    @ApiModelProperty("权限ID")
    private Long permissionId;
    /**
     * 名称
     */
    @ApiModelProperty("名称")
    private String name;
    /**
     * 值
     */
    @ApiModelProperty("值")
    private String value;
    /**
     * 描述
     */
    @ApiModelProperty("描述")
    private String description;
    /**
     * 自定义排序序号
     */
    @ApiModelProperty("自定义排序序号")
    private Integer sort;
    /**
     * 数据创建时间
     */
    @ApiModelProperty("数据创建时间")
    private Date gmtCreate;
    /**
     * 数据修改时间
     */
    @ApiModelProperty("数据修改时间")
    private Date gmtModified;

}
