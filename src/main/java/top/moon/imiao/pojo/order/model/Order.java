package top.moon.imiao.pojo.order.model;

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
public class Order implements Serializable {

    /**
    * 订单ID
    */
    @NotBlank(message="[订单ID]不能为空")
    @Size(max= 30,message="编码长度不能超过30")
    @ApiModelProperty("订单ID")
    @Length(max= 30,message="编码长度不能超过30")
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
    * 订单总价
    */
    @NotNull(message="[订单总价]不能为空")
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
    /**
    * 数据修改时间
    */
    @ApiModelProperty("数据修改时间")
    private LocalDateTime gmtModified;


}
