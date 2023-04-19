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
public class CatInfoAddNewDTO implements Serializable {

    /**
     * 种类ID
     */
    @NotNull(message="[种类ID]不能为空")
    @ApiModelProperty(value = "种类ID", example = "1")
    private Long speciesId;
    /**
    * 拥有者类型
    */
    @NotNull(message="[拥有者类型]不能为空")
    @ApiModelProperty(value = "拥有者类型", example = "1")
    private Long ownerTypeId;
    /**
    * 猫咪颜色
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty(value = "猫咪颜色", example = "白色")
    @Length(max= 50,message="编码长度不能超过50")
    private String color;
    /**
    * 价格
    */
    @ApiModelProperty(value = "价格", example = "100")
    private BigDecimal catPrice;
    /**
    * 猫咪描述
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty(value = "猫咪描述", example = "这是一只很可爱的猫咪")
    @Length(max= 500,message="编码长度不能超过500")
    private String catDescription;
    /**
    * 猫咪体重
    */
    @ApiModelProperty(value = "猫咪体重", example = "10")
    private Integer catWeight;
    /**
    * 猫咪昵称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty(value = "猫咪昵称", example = "小白")
    @Length(max= 50,message="编码长度不能超过50")
    private String catName;
    /**
    * 猫咪年龄
    */
    @ApiModelProperty(value = "猫咪年龄", example = "1")
    private Integer catAge;
    /**
    * 图片URL
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty(value = "图片URL", example = "http://www.baidu.com")
    @Length(max= 500,message="编码长度不能超过500")
    private String catPictures;
    /**
    * 是否可租
    */
    @ApiModelProperty(value = "是否可租", example = "1")
    private Integer available;
    /**
    * 是否启用
    */
    @ApiModelProperty(value = "是否启用", example = "1")
    private Integer enable;

}
