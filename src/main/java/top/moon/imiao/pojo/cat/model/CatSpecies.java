package top.moon.imiao.pojo.cat.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.time.LocalDateTime;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 猫咪种类表
* @TableName imiao_cat_species
*/
@Data
public class CatSpecies implements Serializable {

    /**
    * 
    */

    @ApiModelProperty("品种ID")
    private Long speciesId;
    /**
    * 猫猫种类
    */
    @NotBlank(message="[猫猫种类]不能为空")
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("猫猫种类")
    @Length(max= 50,message="编码长度不能超过50")
    private String catSpecies;
    /**
    * 猫猫描述
    */
    @NotBlank(message="[猫猫描述]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("猫猫描述")
    @Length(max= 255,message="编码长度不能超过255")
    private String description;
    /**
    * 猫猫图片url
    */
    @NotBlank(message="[猫猫图片url]不能为空")
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("猫猫图片url")
    @Length(max= 500,message="编码长度不能超过500")
    private String pictures;
    /**
    * 排序
    */

    @ApiModelProperty("排序")
    private Integer sort;
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
