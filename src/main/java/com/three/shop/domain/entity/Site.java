package com.three.shop.domain.entity;

import lombok.Data;

@Data
public class Site {
    private Integer siteId;

    /**
    * 用户名
    */
    private String username;

    /**
    * 关键字
    */
    private String keyword;

    /**
    * 站点描述
    */
    private String siteDep;

    /**
    * icp备案号
    */
    private String icp;

    /**
    * 公司名称
    */
    private String companyName;

    /**
    * 邮箱
    */
    private String eamil;

    /**
    * 联系电话
    */
    private String phone;

    /**
    * 账号启用状态:1-> 禁用; 1->启用
    */
    private Integer status;

    /**
    * 关闭站点提示
    */
    private String hint;
}