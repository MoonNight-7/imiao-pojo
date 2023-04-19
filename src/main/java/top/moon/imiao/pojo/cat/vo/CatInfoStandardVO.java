package top.moon.imiao.pojo.cat.vo;

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
public class CatInfoStandardVO implements Serializable {

    /**
    * 猫咪ID
    */
    @ApiModelProperty("猫咪ID")
    private Long catId;
    /**
    * 种类ID
    */
    @ApiModelProperty("种类ID")
    private Long speciesId;
    /**
     * 种类名称
     */
    @ApiModelProperty("种类名称")
    private String speciesName;
    /**
    * 拥有者类型
    */
    @ApiModelProperty("拥有者类型")
    private Long ownerTypeId;
    /**
     * 拥有者类型名称
     */
    @ApiModelProperty("拥有者类型名称")
    private String ownerTypeName;
    /**
    * 猫咪颜色
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("猫咪颜色")
    @Length(max= 50,message="编码长度不能超过50")
    private String color;
    /**
    * 价格
    */
    @ApiModelProperty("价格")
    private BigDecimal catPrice;
    /**
    * 猫咪描述
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("猫咪描述")
    @Length(max= 500,message="编码长度不能超过500")
    private String catDescription;
    /**
    * 猫咪体重
    */
    @ApiModelProperty("猫咪体重")
    private Integer catWeight;
    /**
    * 猫咪昵称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("猫咪昵称")
    @Length(max= 50,message="编码长度不能超过50")
    private String catName;
    /**
    * 猫咪年龄
    */
    @ApiModelProperty("猫咪年龄")
    private Integer catAge;
    /**
    * 图片URL
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("图片URL")
    @Length(max= 500,message="编码长度不能超过500")
    private String catPictures;
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
