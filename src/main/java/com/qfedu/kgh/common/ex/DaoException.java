package com.qfedu.kgh.common.ex;


import com.qfedu.kgh.common.result.ResultCode;

public class DaoException extends BaseException {

    public DaoException(ResultCode resultCode) {
        super(resultCode);
    }
}
