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
* 猫咪种类表
* @TableName imiao_cat_species
*/
@Data
public class CatSpeciesStandardVO implements Serializable {

    /**
    * 种类ID
    */
    @NotNull(message="[种类ID]不能为空")
    @ApiModelProperty("种类ID")
    private Long speciesId;
    /**
    * 种类名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("种类名称")
    @Length(max= 50,message="编码长度不能超过50")
    private String speciesName;
    /**
    * 种类简介
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("种类简介")
    @Length(max= 500,message="编码长度不能超过500")
    private String speciesDescription;
    /**
    * 猫咪寿命（年）
    */
    @ApiModelProperty("猫咪寿命（年）")
    private Integer lifeExpectancy;
    /**
    * 猫咪平均体重（kg）
    */
    @ApiModelProperty("猫咪平均体重（kg）")
    private BigDecimal averageWeight;
    /**
    * 猫咪性格特点
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty("猫咪性格特点")
    @Length(max= 100,message="编码长度不能超过100")
    private String temperament;
    /**
    * 猫咪起源地
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("猫咪起源地")
    @Length(max= 50,message="编码长度不能超过50")
    private String countryOfOrigin;
    /**
    * 猫咪毛发长度
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("猫咪毛发长度")
    @Length(max= 20,message="编码长度不能超过20")
    private String coatLength;
    /**
    * 猫咪毛发颜色
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty("猫咪毛发颜色")
    @Length(max= 20,message="编码长度不能超过20")
    private String color;
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
