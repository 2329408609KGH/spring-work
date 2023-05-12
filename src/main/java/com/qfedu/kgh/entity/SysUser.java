package com.qfedu.kgh.entity;

import lombok.Data;

@Data
public class SysUser {
    /**
     * 主键
     */
    private Long uid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户名
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 1 表示正常 0表示删除
     */
    private Integer status;

    /**
     *
     */
    private Integer cartId;
}

