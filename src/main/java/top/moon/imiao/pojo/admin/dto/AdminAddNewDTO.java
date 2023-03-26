package top.moon.imiao.pojo.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 管理员信息表
 *
 * @TableName imiao_admin_info
 */
@Data
public class AdminAddNewDTO implements Serializable {
    /**
     * 用户名
     */
    @Size(max = 16, message = "编码长度不能超过16")
    @ApiModelProperty("用户名")
    @Length(max = 16, message = "编码长度不能超过16")
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
    @ApiModelProperty("头像URL")
    private Long avatarUrl;
    /**
     * 昵称（冗余）
     */
    @Size(max = 16, message = "编码长度不能超过16")
    @ApiModelProperty("昵称（冗余）")
    @Length(max = 16, message = "编码长度不能超过16")
    private String nickname;
    /**
     * 权限ID列表
     */
    @ApiModelProperty("权限ID")
    private String permissionId;

}
