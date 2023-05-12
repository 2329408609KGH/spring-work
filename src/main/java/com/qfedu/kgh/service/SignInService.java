package com.qfedu.kgh.service;

import com.qfedu.kgh.common.ex.ServiceException;
import com.qfedu.kgh.common.request.SignInRequest;
import com.qfedu.kgh.common.result.RespResult;

public interface SignInService {
    /**
     * 签到加积分
     * @param signInRequest
     * @return
     */
    RespResult<Integer> singIn(SignInRequest signInRequest)throws ServiceException;
}
