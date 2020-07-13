package com.three.shop.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Level {
    /**
    * 主键
    */
    private Integer levelId;

    /**
    * 图标
    */
    private String icon;

    /**
    * 等级名称
    */
    private String name;

    /**
    * 等级折扣
    */
    private BigDecimal discount;

    /**
    * 创建时间
    */
    private Date createTime;
}