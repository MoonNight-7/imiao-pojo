package top.moon.imiao.pojo.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import top.moon.imiao.common.validation.RegExpressions;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 管理员信息表
 *
 * @TableName imiao_admin_info
 */
@Data
public class AdminUpdateDTO implements RegExpressions {

    private static final String MESSAGE_PREFIX = "修改失败！";

    @Min(value = 1, message = "管理员ID不存在")
    @NotNull(message = "管理员ID不存在")
    @ApiModelProperty("管理员ID")
    private Long adminId;
    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    @Pattern(regexp = REGEXP_USER_USERNAME, message = MESSAGE_PREFIX + MESSAGE_USER_USERNAME)
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
    @Pattern(regexp = REGEXP_PHONE, message = "手机号格式不正确")
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
