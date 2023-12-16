package com.nageoffer.shortlink.project.dto.req;

import lombok.Data;

/**
 * @author linqi
 * @version 1.0.0
 * @description 回收站保存功能
 */

@Data
public class RecycleBinSaveReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 全部短链接
     */
    private String fullShortUrl;
}
