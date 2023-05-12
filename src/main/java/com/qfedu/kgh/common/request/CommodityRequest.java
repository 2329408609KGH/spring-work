package com.qfedu.kgh.common.request;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class CommodityRequest {

    /**
     * 商品名
     */
    private String commodityName;

    /**
     * 商品价格
     */
    private BigDecimal commodityPrice;

    /**
     * 购物车ID
     */
    private Integer cartId;

    /**
     * 商品数量
     */
    private Integer number;
}
