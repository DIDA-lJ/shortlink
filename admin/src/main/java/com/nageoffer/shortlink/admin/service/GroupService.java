package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;

/**
 * @InterfaceName GroupService
 * @Description 短链接分组接口层
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/28
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

//    /**
//     * 新增短链接分组
//     *
//     * @param username  用户名
//     * @param groupName 短链接分组名
//     */
//    void saveGroup(String username, String groupName);
}
