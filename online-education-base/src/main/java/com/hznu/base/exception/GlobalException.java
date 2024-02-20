package com.hznu.base.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GlobalException extends RuntimeException {
    private String errMessage;

    public GlobalException() {
        super();
    }

    public GlobalException(String errMessage) {
        super(errMessage);
        this.errMessage = errMessage;
    }

    public static void cast(CommonError commonError) {
        throw new GlobalException(commonError.getErrMessage());
    }

    public static void cast(String errMessage) {
        throw new GlobalException(errMessage);
    }

}
