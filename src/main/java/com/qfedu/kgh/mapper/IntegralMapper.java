package com.qfedu.kgh.mapper;

import com.qfedu.kgh.common.request.SignInRequest;
import org.apache.ibatis.annotations.Param;

public interface IntegralMapper {
    /**
     * 修改用户会员积分
     * @param signInRequest
     * @return
     */
    int updateScore(@Param("signInRequest")SignInRequest signInRequest);
}
