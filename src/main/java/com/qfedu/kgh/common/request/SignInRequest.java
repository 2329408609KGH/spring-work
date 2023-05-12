package com.qfedu.kgh.common.request;

import lombok.Data;

import java.util.Date;
@Data
public class SignInRequest {
    /**
     * 会员id
     */
    private Long memberId;

    /**
     * 积分
     */
    private Integer score;

    /**
     * 积分类型 1表示签到积分，2表示购物积分
     */
    private Integer type;

    /**
     * 0表示删除，1表示正常
     */
    private Integer status;
}
