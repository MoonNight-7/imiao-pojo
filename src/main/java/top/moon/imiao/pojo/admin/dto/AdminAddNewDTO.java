package top.moon.imiao.pojo.admin.dto;

import io.swagger.annotations.ApiModelProperty;
import jdk.nashorn.internal.runtime.regexp.RegExpMatcher;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import top.moon.imiao.common.validation.RegExpressions;

import javax.validation.constraints.NotBlank;
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
public class AdminAddNewDTO implements RegExpressions, Serializable {
    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    @Pattern(regexp = REGEXP_ADMIN_USERNAME, message = MESSAGE_ADMIN_USERNAME)
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty("密码")
    @Pattern(regexp = REGEXP_ADMIN_PASSWORD, message = MESSAGE_ADMIN_PASSWORD)
    private String password;
    /**
     * 手机号
     */
    @ApiModelProperty("手机号")
    @Pattern(regexp = REGEXP_PHONE, message = MESSAGE_PHONE)
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
    @NotBlank(message = "权限不能为空")
    private String permissionId;

}
