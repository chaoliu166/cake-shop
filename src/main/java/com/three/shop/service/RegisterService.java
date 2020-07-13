package com.three.shop.service;

import com.three.shop.domain.dto.UserDto;
import com.three.shop.exception.ServiceException;


/**
 * @author Administrator
 */
public interface RegisterService {
    /**
     * 注册用户功能
     * @param userDto  用户的注册内容
     * @return 返回影响行数
     */
    int register(UserDto userDto) throws ServiceException;
}
