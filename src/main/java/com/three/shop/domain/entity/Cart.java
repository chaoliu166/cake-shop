package com.three.shop.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Cart {
    /**
    * 购物车 id
    */
    private Integer cartId;

    /**
    * 用户id，外键，指向user用户表
    */
    private Integer userId;

    /**
    * 商品id，外键，指向product商品表
    */
    private Integer productId;

    /**
    * 商品的图片
    */
    private String productPic;

    /**
    * 商品的名称
    */
    private String productName;

    /**
    * 商品的销售属性
    */
    private String productAttr;

    /**
    * 商品属性
    */
    private String productSize;

    /**
    * 商品单价
    */
    private BigDecimal productPrice;

    /**
    * 商品的购买数量
    */
    private Integer productQuantity;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 修改购物车的时间
    */
    private Date updateTime;

    /**
    * 状态，默认为1使用状态，0为假删除
    */
    private Integer status;
}