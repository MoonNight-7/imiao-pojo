package top.moon.imiao.pojo.order.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
* 订单表
* @TableName imiao_order
*/
@Data
public class OrderListVO implements Serializable {

    /**
    * 订单ID
    */

    @ApiModelProperty("订单ID")
    private String orderId;
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
    private Date startDate;
    /**
    * 结束租赁日期
    */
    @ApiModelProperty("结束租赁日期")
    private Date endDate;

    @ApiModelProperty("订单总价")
    private BigDecimal totalPrice;
    /**
    * 订单状态
    */
    @ApiModelProperty("订单状态")
    private Integer orderStatus;
    /**
    * 数据创建时间
    */
    @ApiModelProperty("数据创建时间")
    private LocalDateTime gmtCreate;


}
