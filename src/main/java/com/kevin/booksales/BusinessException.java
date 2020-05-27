package com.kevin.booksales;

import java.text.MessageFormat;

public class BusinessException extends RuntimeException {

    private int errorCode;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public static void throwException(int errorCode, String message, Object ... arguments) {
        if (null != arguments && arguments.length > 0) {
            message = MessageFormat.format(message, arguments);
        }

        BusinessException exception = new BusinessException(message);
        exception.setErrorCode(errorCode);

        throw exception;
    }
}
