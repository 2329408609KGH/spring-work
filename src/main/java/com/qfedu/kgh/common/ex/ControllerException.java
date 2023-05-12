package com.qfedu.kgh.common.ex;


import com.qfedu.kgh.common.result.ResultCode;

public class ControllerException extends BaseException {

    public ControllerException(ResultCode resultCode) {
        super(resultCode);
    }
}
