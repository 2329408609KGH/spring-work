package com.qfedu.kgh.mapper;

import com.qfedu.kgh.common.request.CommodityRequest;
import com.qfedu.kgh.entity.Commodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityMapper {
    /**
     * 根据用户id查询商品
     * @param uid
     * @return
     */
    List<Commodity> list(@Param("uid") Integer uid);

    Commodity selectCommodityByName(@Param("commodityRequest")CommodityRequest commodityRequest);

    /**
     * 添加商品
     * @param commodityRequest
     * @return
     */
    Integer insert(@Param("commodityRequest")CommodityRequest commodityRequest);

    Integer modNumber(@Param("commodityRequest")CommodityRequest commodityRequest);
}
