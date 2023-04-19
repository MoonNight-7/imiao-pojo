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
* 猫咪种类表
* @TableName imiao_cat_species
*/
@Data
public class CatSpeciesAddNewDTO implements Serializable {


    /**
    * 种类名称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty(value = "种类名称",example = "英国短毛猫")
    @Length(max= 50,message="编码长度不能超过50")
    private String speciesName;
    /**
    * 种类简介
    */
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty(value = "种类简介",example = "英国短毛猫是一种小型猫，体型细长，头部较大，耳朵较大，尾巴较长，毛发短而密，毛色有黑、灰、褐、白等多种颜色。")
    @Length(max= 500,message="编码长度不能超过500")
    private String speciesDescription;
    /**
    * 猫咪寿命（年）
    */
    @ApiModelProperty(value = "猫咪寿命（年）",example = "15")
    private Integer lifeExpectancy;
    /**
    * 猫咪平均体重（kg）
    */
    @ApiModelProperty(value = "猫咪平均体重（kg）",example = "5.5")
    private BigDecimal averageWeight;
    /**
    * 猫咪性格特点
    */
    @Size(max= 100,message="编码长度不能超过100")
    @ApiModelProperty(value = "猫咪性格特点",example = "温顺、活泼、聪明、机警、好动、爱玩、爱撒娇、爱叫、爱吃、爱睡觉、爱逗人、爱玩具、爱逗猫、爱逗狗、爱逗鱼、爱逗鸟、爱逗虫、爱逗鼠、爱逗鼹鼠")
    @Length(max= 100,message="编码长度不能超过100")
    private String temperament;
    /**
    * 猫咪起源地
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty(value = "猫咪起源地",example = "英国")
    @Length(max= 50,message="编码长度不能超过50")
    private String countryOfOrigin;
    /**
    * 猫咪毛发长度
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty(value = "猫咪毛发长度",example = "2~3")
    @Length(max= 20,message="编码长度不能超过20")
    private String coatLength;
    /**
    * 猫咪毛发颜色
    */
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty(value = "猫咪毛发颜色",example = "黑色、灰色、褐色、白色")
    @Length(max= 20,message="编码长度不能超过20")
    private String color;


}
