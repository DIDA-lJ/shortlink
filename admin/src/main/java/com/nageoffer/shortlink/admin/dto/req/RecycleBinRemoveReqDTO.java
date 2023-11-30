package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ClassName RecycleBinRemoveReqDTO
 * @Description 回收站移除功能
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/30
 */
@Data
public class RecycleBinRemoveReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部短链接
     */
    private String fullShortUrl;
}

