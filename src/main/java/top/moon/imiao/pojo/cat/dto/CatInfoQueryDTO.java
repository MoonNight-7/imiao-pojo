package top.moon.imiao.pojo.cat.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
* 猫咪基本信息表
* @TableName imiao_cat_info
*/
@Data
public class CatInfoQueryDTO implements Serializable {

    /**
    * 猫咪ID
    */
    @NotNull(message="[猫咪ID]不能为空")
    @ApiModelProperty("猫咪ID")
    private Long catId;
    /**
    * 种类ID
    */
    @NotNull(message="[种类ID]不能为空")
    @ApiModelProperty("种类ID")
    private Long speciesId;
    /**
    * 拥有者类型
    */
    @NotNull(message="[拥有者类型]不能为空")
    @ApiModelProperty("拥有者类型")
    private Long ownerTypeId;
    /**
    * 猫咪颜色
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("猫咪颜色")
    @Length(max= 50,message="编码长度不能超过50")
    private String color;
    /**
    * 最低价格
    */
    @ApiModelProperty("最低价格")
    private BigDecimal minCatPrice;
    /**
     * 最高价格
     */
    @ApiModelProperty("最高价格")
    private BigDecimal maxCatPrice;
    /**
    * 猫咪最小年龄
    */
    @ApiModelProperty("猫咪最小年龄")
    private Integer minCatAge;
    /**
     * 猫咪最大年龄
     */
    @ApiModelProperty("猫咪最大年龄")
    private Integer maxCatAge;
    /**
    * 是否可租
    */
    @ApiModelProperty("是否可租")
    private Integer available;
    /**
    * 是否启用
    */
    @ApiModelProperty("是否启用")
    private Integer enable;

}
