package top.moon.imiao.pojo.order.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

/**
* 订单表
* @TableName imiao_order
*/
@Data
public class OrderQueryDTO implements Serializable {

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
    /**
    * 订单状态
    */
    @ApiModelProperty("订单状态")
    private Integer orderStatus;


}
