package com.qfedu.kgh.entity;

import lombok.Data;

import java.util.List;

@Data
public class SpCart {
    /**
     * 主键
     */
    private Long cartId;

    /**
     * 用户ID
     */
    private Long uid;

    /**
     * 状态 1表示正常，0表示删除
     */
    private Integer status;
}

