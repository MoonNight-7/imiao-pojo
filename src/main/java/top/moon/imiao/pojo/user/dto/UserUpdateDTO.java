package top.moon.imiao.pojo.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
* 用户与管理员
* @TableName imiao_user_info
*/
@Data
public class UserUpdateDTO implements Serializable {
    /**
    * 用户名
    */
    @ApiModelProperty("用户名")
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码" )
    private String password;
    /**
    * 头像id
    */
    @ApiModelProperty("头像url")
    private String avatarUrl;
    /**
    * 昵称
    */
    @ApiModelProperty("昵称")
    private String nickname;
    /**
    * 手机号
    */
    @ApiModelProperty("手机号")
    private String phone;
    /**
    * 性别
    */
    @ApiModelProperty("性别")
    private Integer gender;
}
