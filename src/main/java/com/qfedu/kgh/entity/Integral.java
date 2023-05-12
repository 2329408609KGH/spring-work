package com.qfedu.kgh.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Integral {
    /**
     * 主键
     */
    private Long integralId;

    /**
     * 会员积分
     */
    private Integer score;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 1表示 注册积分 2表示签到积分
     */
    private Integer type;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 状态
     */
    private Integer status;
}

