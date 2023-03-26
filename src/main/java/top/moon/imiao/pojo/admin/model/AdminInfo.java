package top.moon.imiao.pojo.admin.model;

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
* 管理员信息表
* @TableName imiao_admin_info
*/
@Data
public class AdminInfo implements Serializable {

    @ApiModelProperty("管理员ID")
    private Long adminId;
    /**
    * 用户名
    */
    @Size(max= 16,message="编码长度不能超过16")
    @ApiModelProperty("用户名")
    @Length(max= 16,message="编码长度不能超过16")
    private String username;
    /**
    * 密码
    */
    @ApiModelProperty("密码")
    private String password;
    /**
    * 手机号
    */
    @ApiModelProperty("手机号")
    private String phone;
    /**
    * 头像ID
    */
    @ApiModelProperty("头像ID")
    private Long avatarUrl;
    /**
    * 是否启用，默认为1
    */
    @ApiModelProperty("是否启用，默认为1")
    private Integer enable;
    /**
    * 昵称（冗余）
    */
    @Size(max= 16,message="编码长度不能超过16")
    @ApiModelProperty("昵称（冗余）")
    @Length(max= 16,message="编码长度不能超过16")
    private String nickname;
    /**
    * 权限ID列表
    */
    @ApiModelProperty("权限ID")
    private String permissionId;
    /**
    * 登录次数
    */
    @ApiModelProperty("登录次数")
    private Integer loginCount;
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
    /**
    * 数据最后修改时间
    */
    @ApiModelProperty("数据最后修改时间")
    private LocalDateTime gmtModified;

}
