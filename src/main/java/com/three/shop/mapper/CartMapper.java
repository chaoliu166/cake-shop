package com.three.shop.mapper;

import com.three.shop.domain.entity.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer cartId);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer cartId);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
}