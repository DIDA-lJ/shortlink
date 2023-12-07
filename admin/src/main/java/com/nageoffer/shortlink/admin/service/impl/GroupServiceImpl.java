package com.nageoffer.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nageoffer.shortlink.admin.common.biz.user.UserContext;
import com.nageoffer.shortlink.admin.dao.entity.GroupDO;
import com.nageoffer.shortlink.admin.dao.mapper.GroupMapper;
import com.nageoffer.shortlink.admin.service.GroupService;
import com.nageoffer.shortlink.admin.toolkit.RandomGenerator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @ClassName GroupServiceImpl
 * @Description 短链接分组接口实现层
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/28
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService {

    private final RedissonClient redissonClient;

    @Value("${short-link.group.max-num}")
    private Integer groupMaxNum;
    @Override
    public void saveGroup(String groupName) {
        String gid;
            do {
                gid = RandomGenerator.generateRandom();
            } while (!hasGid(gid));
            GroupDO groupDO = GroupDO.builder()
                    .gid(gid)
                    .sortOrder(0)
                    .name(groupName)
                    .build();
            baseMapper.insert(groupDO);
    }

//    @Override
//    public void saveGroup(String username, String groupName) {
//        RLock lock = redissonClient.getLock(String.format(LOCK_GROUP_CREATE_KEY, username));
//        lock.lock();
//        try {
//            // 查询用户
//            LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
//                    .eq(GroupDO::getUsername, username)
//                    .eq(GroupDO::getDelFlag, 0);
//            List<GroupDO> groupDOList = baseMapper.selectList(queryWrapper);
//            if (CollUtil.isNotEmpty(groupDOList) && groupDOList.size() == groupMaxNum) {
//                throw new ClientException(String.format("已超出最大分组数：%d", groupMaxNum));
//            }
//            String gid;
//            do {
//                gid = RandomGenerator.generateRandom();
//            } while (!hasGid(username, gid));
//            GroupDO groupDO = GroupDO.builder()
//                    .gid(gid)
//                    .sortOrder(0)
//                    .username(username)
//                    .name(groupName)
//                    .build();
//            baseMapper.insert(groupDO);
//        } finally {
//            lock.unlock();
//        }
//    }

    private boolean hasGid(String gid) {
        LambdaQueryWrapper<GroupDO> queryWrapper = Wrappers.lambdaQuery(GroupDO.class)
                .eq(GroupDO::getGid, gid)
                // 设置用户名
                .eq(GroupDO::getUsername, null);
        GroupDO hasGroupFlag = baseMapper.selectOne(queryWrapper);
        return hasGroupFlag == null;
    }
}
