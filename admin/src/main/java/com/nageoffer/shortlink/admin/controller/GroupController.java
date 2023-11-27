package com.nageoffer.shortlink.admin.controller;

import com.nageoffer.shortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GroupController
 * @Description 短链接分组控制层
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/28
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

}
