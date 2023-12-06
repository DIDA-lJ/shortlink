package com.nageoffer.shorklink.project.common.convention.exception;

import com.nageoffer.shorklink.project.common.convention.errorcode.BaseErrorCode;
import com.nageoffer.shorklink.project.common.convention.errorcode.IErrorCode;

/**
 * @ClassName ClientException
 * @Description 客户端异常
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/12/06
 */
public class ClientException extends AbstractException {

    public ClientException(IErrorCode errorCode) {
        this(null, null, errorCode);
    }

    public ClientException(String message) {
        this(message, null, BaseErrorCode.CLIENT_ERROR);
    }

    public ClientException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ClientException(String message, Throwable throwable, IErrorCode errorCode) {
        super(message, throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ClientException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}
