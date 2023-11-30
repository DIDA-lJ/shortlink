package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ClassName ShortLinkGroupSaveReqDTO
 * @Description 短链接分组创建参数
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/30
 */
@Data
public class ShortLinkGroupSaveReqDTO {

    /**
     * 分组名
     */
    private String name;
}
