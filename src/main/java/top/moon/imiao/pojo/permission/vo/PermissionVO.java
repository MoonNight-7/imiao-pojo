package top.moon.imiao.pojo.permission.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * 权限表
 *
 * @TableName imiao_permission
 */
@Data
public class PermissionVO implements Serializable {
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

}
