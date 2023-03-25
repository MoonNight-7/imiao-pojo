package top.moon.imiao.pojo.user.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
* 用户与管理员
* @TableName imiao_user_info
*/
@Data
public class UserDetailVO implements Serializable {

    /**
    * 用户id
    */
    @ApiModelProperty("用户id")
    private Long userId;
    /**
    * 用户名
    */
    @ApiModelProperty("用户名")
    private String username;

    /**
    * 头像id
    */
    @ApiModelProperty("头像id")
    private Long avatarUrl;
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
    /**
     * 积分
     */
    @ApiModelProperty("用户积分")
    private Long rewardPoint;
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
    /**
    * 最后登录时间
    */
    @ApiModelProperty("最后登录时间")
    private LocalDateTime gmtLastLogin;
    /**
    * 数据创建时间
    */
    @ApiModelProperty("数据创建时间")
    private LocalDateTime gmtCreate;
}
