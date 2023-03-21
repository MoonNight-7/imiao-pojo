package top.moon.imiao.pojo.cat.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
* 用户提交猫表
* @TableName imiao_cat_post
*/
@Data
public class CatPost implements Serializable {

    /**
    * 
    */

    @ApiModelProperty("发布猫猫ID")
    private Long postId;
    /**
    * 用户id
    */
    @NotNull(message="[用户id]不能为空")
    @ApiModelProperty("用户id")
    private Long adminId;
    /**
    * 猫猫种类
    */
    @NotNull(message="[猫猫种类]不能为空")
    @ApiModelProperty("猫猫种类")
    private Long catSpeciesId;
    /**
    * 简介
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("简介")
    @Length(max= 200,message="编码长度不能超过200")
    private String description;
    /**
    * 猫咪昵称
    */
    @NotBlank(message="[猫咪昵称]不能为空")
    @Size(max= 10,message="编码长度不能超过10")
    @ApiModelProperty("猫咪昵称")
    @Length(max= 10,message="编码长度不能超过10")
    private String nickname;
    /**
    * 猫咪年龄（3位，精度1）
    */
    @NotNull(message="[猫咪年龄（3位，精度1）]不能为空")
    @ApiModelProperty("猫咪年龄（3位，精度1）")
    private BigDecimal age;
    /**
    * 猫咪售卖价格（8位，精度2）
    */
    @ApiModelProperty("猫咪售卖价格（8位，精度2）")
    private BigDecimal salePrice;
    /**
    * 猫咪出租价格（8位，精度2）
    */
    @ApiModelProperty("猫咪出租价格（8位，精度2）")
    private BigDecimal rentPrice;
    /**
    * 是否出租
    */
    @NotNull(message="[是否出租]不能为空")
    @ApiModelProperty("是否出租")
    private Integer rent;
    /**
    * 是否售出
    */
    @NotNull(message="[是否售出]不能为空")
    @ApiModelProperty("是否售出")
    private Integer sold;
    /**
    * 猫猫图片url
    */
    @NotBlank(message="[猫猫图片url]不能为空")
    @Size(max= 500,message="编码长度不能超过500")
    @ApiModelProperty("猫猫图片url")
    @Length(max= 500,message="编码长度不能超过500")
    private String pictures;
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
