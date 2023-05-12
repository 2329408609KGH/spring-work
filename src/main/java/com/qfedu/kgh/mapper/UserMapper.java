package com.qfedu.kgh.mapper;

import com.qfedu.kgh.entity.SysUser;

public interface UserMapper {
    /**
     * 根据购物车id查询用户信息
     * @param cartId
     * @return
     */
    SysUser selectUserByid(int cartId);
}
