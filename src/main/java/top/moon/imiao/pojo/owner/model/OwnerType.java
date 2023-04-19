package top.moon.imiao.pojo.owner.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
* 
* @TableName imiao_owner_type
*/
@Data
public class OwnerType implements Serializable {

    /**
    * 类别ID
    */
    @NotNull(message="[类别ID]不能为空")
    @ApiModelProperty("类别ID")
    private Long ownerTypeId;
    /**
    * 拥有者类型名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("拥有者类型名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String ownerTypeName;
    /**
    * 拥有着类型描述
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("拥有着类型描述")
    @Length(max= 200,message="编码长度不能超过200")
    private String ownerTypeDescription;
    /**
    * 数据创建时间
    */
    @ApiModelProperty("数据创建时间")
    private LocalDateTime gmtCreate;
    /**
    * 数据修改时间
    */
    @ApiModelProperty("数据修改时间")
    private LocalDateTime gmtModified;


}