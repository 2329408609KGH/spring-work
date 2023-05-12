package com.qfedu.kgh.service.impl;

import com.qfedu.kgh.common.ex.ServiceException;
import com.qfedu.kgh.common.request.CommodityRequest;
import com.qfedu.kgh.common.result.RespResult;
import com.qfedu.kgh.common.result.ResultCode;
import com.qfedu.kgh.common.vo.SpCartVO;
import com.qfedu.kgh.entity.Commodity;
import com.qfedu.kgh.mapper.CommodityMapper;
import com.qfedu.kgh.mapper.SpCartMapper;
import com.qfedu.kgh.mapper.UserMapper;
import com.qfedu.kgh.service.SpCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

@Service
public class SpCartServiceImpl implements SpCartService {
    @Autowired
    private SpCartMapper spCartMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public SpCartVO list(Long uid) {

        SpCartVO spCarts = spCartMapper.selectListByUid(uid);
        if (!ObjectUtils.isEmpty(spCarts)){
            return spCarts;
        }else {
            throw new ServiceException(ResultCode.USER_NOT_EXIST);
        }

    }

    @Transactional
    @Override
    public RespResult<Integer> addSpCart(CommodityRequest commodityRequest) {
        int count = 0;
        //根据商品名查询是否有该商品
        Commodity commodity = commodityMapper.selectCommodityByName(commodityRequest);
        //判断是否有相同的商品
        if (ObjectUtils.isEmpty(commodity)){
            //没有就添加商品
            count = commodityMapper.insert(commodityRequest);
        }else {
            //有就修改商品数量
            count = commodityMapper.modNumber(commodityRequest);
        }

        //判断是否添加成功
        if (count > 0) {
            return RespResult.success(count);
        } else {
            throw new ServiceException(ResultCode.COMMODITY_ADD_ERROR);
        }
    }
}
