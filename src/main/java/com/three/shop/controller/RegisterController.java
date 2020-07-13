package com.three.shop.controller;

import com.three.shop.domain.dto.UserDto;
import com.three.shop.exception.ServiceException;
import com.three.shop.service.RegisterService;
import com.three.shop.utils.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@RestController
public class RegisterController {
    @Resource
    RegisterService registerService;
    @PostMapping("/register")
    public ResponseEntity<Integer> registerController(UserDto userDto) throws ServiceException {
        int count = registerService.register(userDto);
        return ResponseEntity.success(count);
    }
}
