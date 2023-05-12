package com.qfedu.kgh.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Signin {
    /**
     * 主键
     */
    private Long signInId;

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
     * 创建时间
     */
    private Date createTime;

    /**
     * 0表示删除，1表示正常
     */
    private Integer status;
}

