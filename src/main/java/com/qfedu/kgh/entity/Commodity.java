package com.qfedu.kgh.entity;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class Commodity {
    /**
     * 主键
     */
    private Integer commodityId;

    /**
     * 商品名
     */
    private String commodityName;

    /**
     * 商品价格
     */
    private BigDecimal commodityPrice;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 购物车ID
     */
    private Integer cartId;

    /**
     * 商品数量
     */
    private Integer number;
}

