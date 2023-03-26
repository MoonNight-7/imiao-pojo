package top.moon.imiao.pojo.permission.dto;

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
public class PermissionDTO implements Serializable {
    /**
     * 权限ID
     */
    //@NotNull(message = "[权限ID]不能为空")
    @ApiModelProperty("权限ID")
    private Long permissionId;
    /**
     * 名称
     */
    @Size(max = 50, message = "编码长度不能超过50")
    @ApiModelProperty("名称")
    @Length(max = 50, message = "编码长度不能超过50")
    private String name;
    /**
     * 值
     */
    @Size(max = 255, message = "编码长度不能超过255")
    @ApiModelProperty("值")
    @Length(max = 255, message = "编码长度不能超过255")
    private String value;
    /**
     * 描述
     */
    @Size(max = 255, message = "编码长度不能超过255")
    @ApiModelProperty("描述")
    @Length(max = 255, message = "编码长度不能超过255")
    private String description;
    /**
     * 自定义排序序号
     */
    @ApiModelProperty("自定义排序序号")
    private Integer sort;

}
