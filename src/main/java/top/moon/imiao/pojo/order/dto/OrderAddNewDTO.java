package top.moon.imiao.pojo.order.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
* 订单表
* @TableName imiao_order
*/
@Data
public class OrderAddNewDTO implements Serializable {

    /**
    * 用户ID
    */
    @ApiModelProperty("用户ID")
    private Long userId;
    /**
    * 猫咪ID
    */
    @ApiModelProperty("猫咪ID")
    private Long catId;
    /**
    * 开始租赁日期
    */
    @ApiModelProperty("开始租赁日期")
    private String startDate;
    /**
    * 结束租赁日期
    */
    @ApiModelProperty("结束租赁日期")
    private String endDate;
    /**
    * 订单总价
    */
    @NotNull(message="[订单总价]不能为空")
    @ApiModelProperty("订单总价")
    private BigDecimal totalPrice;

}
