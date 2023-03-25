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
    @ApiModelProperty("用户名")
    @Length(max= 20,message="编码长度不能超过20")
    private String username;
    /**
    * 密码
    */
    @NotBlank(message="[密码]不能为空")
    @ApiModelProperty("密码")
    private String password;
    /**
    * 头像id
    */
    @ApiModelProperty("头像url")
    private Long avatarUrl;
    /**
    * 昵称
    */
    @Size(max= 50,message="编码长度不能超过50")
    @ApiModelProperty("昵称")
    @Length(max= 50,message="编码长度不能超过50")
    private String nickname;
    /**
    * 手机号
    */
    @NotBlank(message="[手机号]不能为空")
    @Size(max= 255,message="编码长度不能超过255")
    @ApiModelProperty("手机号")
    @Length(max= 255,message="编码长度不能超过255")
    private String phone;
    /**
    * 性别
    */
    @ApiModelProperty("性别")
    private Integer gender;
    /**
    * 累计登录次数
    */
    @ApiModelProperty("累计登录次数")
    private Integer loginCount;
    /**
    * 是否被禁用（默认为0）
    */
    @ApiModelProperty("是否启用（默认为1）")
    private Integer enable;
}
