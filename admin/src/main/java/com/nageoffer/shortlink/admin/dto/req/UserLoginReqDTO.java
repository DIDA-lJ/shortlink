package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ClassName UserLoginReqDTO
 * @Description 用户登录请求参数
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/26
 */
@Data
public class UserLoginReqDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
