package com.qfedu.kgh.service.impl;

import com.qfedu.kgh.common.ex.ServiceException;
import com.qfedu.kgh.common.request.SignInRequest;
import com.qfedu.kgh.common.result.RespResult;
import com.qfedu.kgh.common.result.ResultCode;
import com.qfedu.kgh.mapper.IntegralMapper;
import com.qfedu.kgh.mapper.SignInMapper;
import com.qfedu.kgh.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SignInServiceImpl implements SignInService {
    @Autowired
    private SignInMapper signInMapper;
    @Autowired
    private IntegralMapper integralMapper;
    @Transactional
    @Override
    public RespResult<Integer> singIn(SignInRequest signInRequest) {

        int count = signInMapper.insertSingIn(signInRequest);
        //判断是否签到成功
        if (count > 0) {
            //修改用户的会员积分
            count = integralMapper.updateScore(signInRequest);
            //判断是否修改成功
            if (count > 0) {
                return RespResult.success(count);
            } else {
                throw new ServiceException(ResultCode.SIGNIN_ADD_ERROR);
            }
        } else {
            throw new ServiceException(ResultCode.SIGNIN_ERROR);
        }
    }
}
