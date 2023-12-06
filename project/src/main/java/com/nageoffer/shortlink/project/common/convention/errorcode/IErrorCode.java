package com.nageoffer.shortlink.project.common.convention.errorcode;

/**
 * @InterfaceName IErrorCode
 * @Description 平台错误码
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/12/06
 */
public interface IErrorCode {

    /**
     * 错误码
     */
    String code();

    /**
     * 错误信息
     */
    String message();
}
