package com.three.shop.service.impl;

import com.three.shop.domain.dto.UserDto;
import com.three.shop.exception.ServiceException;
import com.three.shop.mapper.UserMapper;
import com.three.shop.service.RegisterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-mybatis.xml","classpath:spring-tx.xml"})
public class RegisterServiceImplTest {
    @Resource
    RegisterService registerService;
    @Test
    public void register() throws ServiceException {
        UserDto userDto = new UserDto();
        userDto.setUsername("张三");
        userDto.setPassword("123456789");
        userDto.setEmail("123@123.com");
        userDto.setPhone("1233525244");
        int register = registerService.register(userDto);
    }
}