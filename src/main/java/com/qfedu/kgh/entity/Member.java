package com.qfedu.kgh.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Member {
    /**
     * 主键
     */
    private Long memberId;

    /**
     * 会员名
     */
    private String memberName;

    /**
     * 昵称
     */
    private String nick;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 注册日期
     */
    private Date createDate;

    /**
     * 1.表示锁定 0.表示正常
     */
    private Integer locked;

    /**
     * 1.正常 0.表示激活/删除
     */
    private Integer status;
}

