package com.three.shop.mapper;

import com.three.shop.domain.entity.Site;

public interface SiteMapper {
    int deleteByPrimaryKey(Integer siteId);

    int insert(Site record);

    int insertSelective(Site record);

    Site selectByPrimaryKey(Integer siteId);

    int updateByPrimaryKeySelective(Site record);

    int updateByPrimaryKey(Site record);
}