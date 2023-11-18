package com.nageoffer.shortlink.admin.dto.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nageoffer.shortlink.admin.common.serialize.PhoneDesensitizationSerializer;
import lombok.Data;

/**
 * @ClassName UserRespDTO
 * @Description 用户返回参数响应
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/06
 */
@Data
public class UserActualRespDTO {
    /**
     * id
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;


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
