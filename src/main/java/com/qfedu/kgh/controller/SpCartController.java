package com.qfedu.kgh.controller;

import com.github.pagehelper.PageInfo;
import com.qfedu.kgh.common.request.CommodityRequest;
import com.qfedu.kgh.common.result.RespResult;
import com.qfedu.kgh.common.vo.SpCartVO;
import com.qfedu.kgh.service.SpCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cart")
public class SpCartController {
    @Autowired
    private SpCartService spCartService;

    /**
     * 获取用户的购物车所有信息
     * @param uid
     * @return
     */
    @GetMapping("/list")
    public RespResult<SpCartVO> list( long uid){
        return RespResult.success(spCartService.list( uid));
    }

    /**
     * 添加商品进购物车
     * @param commodityRequest
     * @return
     */
    @PostMapping("/add")
    public RespResult<Integer> addSpCart(@RequestBody CommodityRequest commodityRequest){
        return spCartService.addSpCart(commodityRequest);
    }
}
