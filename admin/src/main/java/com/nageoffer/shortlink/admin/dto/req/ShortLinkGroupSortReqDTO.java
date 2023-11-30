package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ClassName ShortLinkGroupSortReqDTO
 * @Description 短链接分组排序参数
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/30
 */
@Data
public class ShortLinkGroupSortReqDTO {

    /**
     * 分组ID
     */
    private String gid;

    /**
     * 排序
     */
    private Integer sortOrder;
}
