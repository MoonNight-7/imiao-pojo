package top.moon.imiao.pojo.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
* 用户与管理员
* @TableName imiao_user_info
*/
@Data
public class UserAddNewDTO implements Serializable {
    /**
    * 用户名
    */
    @NotBlank(message="[用户名]不能为空")
    @Size(max= 20,message="编码长度不能超过20")
    @ApiModelProperty(value = "用户名" ,name = "username",example = "user",required = true)
    @Length(max= 20,message="编码长度不能超过20")
    private String username;
    /**
    * 密码
    */
    @NotBlank(message="[密码]不能为空")
    @ApiModelProperty(value = "密码" ,name = "password",example = "123456",required = true)
    private String password;
    /**
    * 头像id
    */
    @ApiModelProperty("头像url")
    private String avatarUrl;
    /**
    * 昵称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty(value = "昵称",name = "nickname",example = "普通用户",required = true)
    @Length(max= 50,message="编码长度不能超过50")
    private String nickname;
    /**
    * 手机号
    */
    @NotBlank(message="[手机号]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty(value = "手机号",name = "phone",example = "12345678901",required = true)
    @Length(max= 255,message="编码长度不能超过255")
    private String phone;
    /**
    * 性别
    */
    @ApiModelProperty(value = "性别",name = "gender",example = "1",required = true)
    private Integer gender;

    /**
    * 是否被禁用（默认为0）
    */
    @ApiModelProperty(value = "是否启用（默认为1）", name = "enable", example = "1", required = true)
    private Integer enable;
}
