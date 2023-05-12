package com.qfedu.kgh.common.ex;

import com.qfedu.kgh.common.result.ResultCode;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException {
    private ResultCode resultCode;

    public BaseException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}
