package top.moon.imiao.pojo.money.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 用户账户金钱表
* @TableName imiao_user_money
*/
@Data
public class UserMoney implements Serializable {

    /**
    * 用户ID
    */
    @NotNull(message="[用户ID]不能为空")
    @ApiModelProperty("用户ID")
    private Long userId;
    /**
    * 账户余额
    */
    @ApiModelProperty("账户余额")
    private BigDecimal balance;
    /**
    * 数据创建时间
    */

    @ApiModelProperty("数据创建时间")
    private Date gmtCreate;
    /**
    * 数据最后修改时间
    */

    @ApiModelProperty("数据最后修改时间")
    private Date gmtModified;
}
