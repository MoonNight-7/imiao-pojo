package top.moon.imiao.pojo.money.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* 用户账户金钱表
* @TableName imiao_user_money
*/
@Data
public class UserMoneyStandardVO implements Serializable {

    /**
    * 用户ID
    */
    @ApiModelProperty("用户ID")
    private Long userId;
    /**
    * 账户余额
    */
    @ApiModelProperty("账户余额")
    private BigDecimal balance;

}
