package com.three.shop.domain.dto;

import lombok.Data;

/**
 * @author Administrator
 */
@Data
public class UserDto {
    private String username;
    private String password;
    private String email;
    private String phone;
}
