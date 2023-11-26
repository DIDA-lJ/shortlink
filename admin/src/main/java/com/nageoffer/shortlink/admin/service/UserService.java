package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;

/**
 * @ClassName UserService
 * @Description 用户接口层
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/06
 */
public interface UserService extends IService<UserDO> {
    /**
     * 根据用户名查找用户信息
     * @param username 用户名
     * @return 用户响应实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否唯一
     * @param username 用户名
     * @return 用户存在返回 True，用户不存在返回 false；
     */
    Boolean  hasUsername(String username);

    /**
     * 注册用户
     * @param requestParam 注册用户请求参数
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户
     *
     * @param requestParam 修改用户请求参数
     */
    void update(UserUpdateReqDTO requestParam);


}
