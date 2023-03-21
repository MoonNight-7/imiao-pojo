package top.moon.imiao.pojo.avatar.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 头像信息表
* @TableName imiao_avatar
*/
@Data
public class Avatar implements Serializable {

    /**
    * 头像id
    */

    @ApiModelProperty("头像id")
    private Long avatarId;
    /**
    * 头像url
    */
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("头像url")
    @Length(max= 255,message="编码长度不能超过255")
    private String url;
    /**
    * 头像名字
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("头像名字")
    @Length(max= 50,message="编码长度不能超过50")
    private String name;

}
