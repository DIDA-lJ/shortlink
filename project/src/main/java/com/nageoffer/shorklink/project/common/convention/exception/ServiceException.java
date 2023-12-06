package com.nageoffer.shorklink.project.common.convention.exception;

import com.nageoffer.shorklink.project.common.convention.errorcode.BaseErrorCode;
import com.nageoffer.shorklink.project.common.convention.errorcode.IErrorCode;

import java.util.Optional;

/**
 * @ClassName ServiceException
 * @Description 服务端异常
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/12/06
 */
public class ServiceException extends AbstractException {

    public ServiceException(String message) {
        this(message, null, BaseErrorCode.SERVICE_ERROR);
    }

    public ServiceException(IErrorCode errorCode) {
        this(null, errorCode);
    }

    public ServiceException(String message, IErrorCode errorCode) {
        this(message, null, errorCode);
    }

    public ServiceException(String message, Throwable throwable, IErrorCode errorCode) {
        super(Optional.ofNullable(message).orElse(errorCode.message()), throwable, errorCode);
    }

    @Override
    public String toString() {
        return "ServiceException{" +
                "code='" + errorCode + "'," +
                "message='" + errorMessage + "'" +
                '}';
    }
}

