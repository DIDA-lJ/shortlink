package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.convention.result.Result;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;
import com.nageoffer.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description 用户管理 controller 层
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/05
 */
@RestController
@RequiredArgsConstructor
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        UserRespDTO result = userService.getUserByUsername(username);
        return new Result<UserRespDTO>().setCode("0").
                setData(userService.getUserByUsername(username));
    }

}
