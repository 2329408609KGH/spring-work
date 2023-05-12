package com.qfedu.kgh.common.result;

import lombok.Getter;

@Getter
public enum ResultCode {
    /**
     * 成功
     */
    SUCCESS(200, "success"),
    /**
     *
     */
    SYS_ERROR(40000, "error"),
    /**
     *
     */
    USER_PASSWORD_ERROR(40100, "账号密码错误"),
    /**
     *
     */
    USER_EXIST(40101, "账号已存在"),
    USER_NOT_EXIST(40109, "用户不存在"),

    MEMBER_NO_EXIST(40103, "账号不存在"),
    MEMBER_IS_LOCKED(40102, "账号被锁定"),
    MEMBER_PASSWORD_ERROR(40104, "密码错误"),
    SIGNIN_ERROR(40105,"签到失败"),
    SIGNIN_ADD_ERROR(40106,"积分添加失败"),
    COMMODITY_ADD_ERROR(40107,"添加购物车失败");

    final int code;
    final String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
