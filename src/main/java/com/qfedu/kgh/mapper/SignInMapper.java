package com.qfedu.kgh.mapper;

import com.qfedu.kgh.common.request.SignInRequest;
import org.apache.ibatis.annotations.Param;

public interface SignInMapper {
    /**
     * 签到记录
     * @param signInRequest
     * @return
     */
    int insertSingIn(@Param("signInRequest") SignInRequest signInRequest);
}
