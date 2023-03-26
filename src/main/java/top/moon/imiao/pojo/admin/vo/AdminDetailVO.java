package top.moon.imiao.pojo.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import top.moon.imiao.pojo.permission.vo.PermissionVO;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * AdminVO:
 *
 * @author xingzhanqi
 * @date 2023/03/20 14:01
 */
@Data
@ApiModel("管理员详细信息视图")
public class AdminDetailVO implements Serializable {

    @ApiModelProperty("管理员ID")
    private Long adminId;
    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String username;
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
    @ApiModelProperty("昵称（冗余）")
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
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime gmtCreate;
    /**
     * 数据最后修改时间
     */
    @ApiModelProperty("数据最后修改时间")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime gmtModified;

}
