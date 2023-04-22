package top.moon.imiao.pojo.money.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
* 用户账户金钱表
* @TableName imiao_user_money
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMoneyAddNewDTO implements Serializable {

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
}
