package com.qfedu.kgh.mapper;

import com.qfedu.kgh.common.vo.SpCartVO;
import com.qfedu.kgh.entity.SpCart;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpCartMapper {
    /**
     * 根据用户id查询购物车
     * @param uid
     * @return
     */
    SpCartVO selectListByUid(@Param("uid") Long uid);

    /**
     * 添加商品进购物车
     * @param uid
     * @return
     */
    int insert(@Param("uid") long uid);
}
