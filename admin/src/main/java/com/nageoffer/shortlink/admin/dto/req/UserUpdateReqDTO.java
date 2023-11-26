package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ClassName UserUpdateDTO
 * @Description 用户请求修改 DTO
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/26
 */
@Data
public class UserUpdateReqDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;
}
