package top.moon.imiao.pojo.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import top.moon.imiao.common.validation.RegExpressions;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
* 用户与管理员
* @TableName imiao_user_info
*/
@Data
public class UserAddNewDTO implements RegExpressions,Serializable {
    /**
    * 用户名
    */
    @ApiModelProperty(value = "用户名" ,name = "username",example = "user",required = true)
    @Pattern(regexp = REGEXP_USER_USERNAME, message = MESSAGE_USER_USERNAME)
    private String username;
    /**
    * 密码
    */
    @ApiModelProperty(value = "密码" ,name = "password",example = "123456",required = true)
    @Pattern(regexp = REGEXP_USER_PASSWORD, message = MESSAGE_USER_PASSWORD)
    private String password;
    /**
    * 头像id
    */
    @ApiModelProperty("头像url")
    private String avatarUrl;
    /**
    * 昵称
    */
    @ApiModelProperty(value = "昵称",name = "nickname",example = "普通用户",required = true)
    private String nickname;
    /**
    * 手机号
    */
    @ApiModelProperty(value = "手机号",name = "phone",example = "12345678901",required = true)
    @Pattern(regexp = REGEXP_PHONE, message = MESSAGE_PHONE)
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
