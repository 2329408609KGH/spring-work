package com.qfedu.kgh.service;

import com.github.pagehelper.PageInfo;
import com.qfedu.kgh.common.ex.ServiceException;
import com.qfedu.kgh.common.request.CommodityRequest;
import com.qfedu.kgh.common.result.RespResult;
import com.qfedu.kgh.common.vo.SpCartVO;

import java.util.List;

public interface SpCartService {
    /**
     * 根据用户id查询购物车所有信息
     * @param uid
     * @return
     */
    SpCartVO list(Long uid) throws ServiceException;

    /**
     * 添加商品进购物车
     * @param commodityRequest
     * @return
     */
    RespResult<Integer> addSpCart(CommodityRequest commodityRequest) throws ServiceException;
}
