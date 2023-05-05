package top.moon.imiao.pojo.money.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * UserMoneyRechargeDTO:
 *
 * @author xingzhanqi
 * @date 2023/05/03 0:47
 */
@Data
public class UserMoneyRechargeDTO implements Serializable {

    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("账户余额")
    private BigDecimal balance;
}
