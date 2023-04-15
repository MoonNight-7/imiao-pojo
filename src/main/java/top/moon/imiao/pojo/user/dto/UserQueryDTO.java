package top.moon.imiao.pojo.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * UserQueryDTO:
 *
 * @author xingzhanqi
 * @date 2023/04/14 16:17
 */
@Data
public class UserQueryDTO implements Serializable {

    @ApiModelProperty(value = "用户id")
    private Long userId;

    @ApiModelProperty(value = "昵称", name = "nickname", example = "普通用户", required = true)
    private String nickname;

    @ApiModelProperty(value = "是否启用（默认为1）", name = "enable", example = "1", required = true)
    private Integer enable;

}
