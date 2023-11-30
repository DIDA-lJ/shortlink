package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ClassName RecycleBinRecoverReqDTO
 * @Description 回收站恢复功能
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/30
 */
@Data
public class RecycleBinRecoverReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部短链接
     */
    private String fullShortUrl;
}
