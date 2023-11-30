package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * @ClassName ShortLinkGroupUpdateReqDTO
 * @Description 短链接分组修改参数
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/11/30
 */
@Data
public class ShortLinkGroupUpdateReqDTO {

    /**
     * 分组标识
     */
    private String gid;

    /**
     * 分组名
     */
    private String name;
}
