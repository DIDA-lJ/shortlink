package com.nageoffer.shortlink.project.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author linqi
 * @version 1.0.0
 * @description 短链接访问网络监控响应参数
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShortLinkStatsNetworkRespDTO {

    /**
     * 统计
     */
    private Integer cnt;

    /**
     * 访问网络
     */
    private String network;

    /**
     * 占比
     */
    private Double ratio;
}
