package com.qfedu.kgh.common.ex;


import com.qfedu.kgh.common.result.ResultCode;

public class ServiceException extends BaseException {

    public ServiceException(ResultCode resultCode) {
        super(resultCode);
    }
}
