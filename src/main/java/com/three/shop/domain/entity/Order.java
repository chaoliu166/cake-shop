package com.three.shop.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Order {
    /**
    * 订单主键
    */
    private Integer orderId;

    /**
    * 订单号
    */
    private String orderNo;

    /**
    * 会员id
    */
    private Integer userId;

    /**
    * 订单总价
    */
    private BigDecimal total;

    private String address;

    /**
    * 订单状态 0删除 1待付款 2已发货 3待评价 4订单已完成
    */
    private Integer status;

    /**
    * 创建时间
    */
    private Date createTime;
}