package com.qfedu.kgh.common.vo;

import com.qfedu.kgh.entity.Commodity;
import lombok.Data;

import java.util.List;

@Data
public class SpCartVO {
    /**
     * 主键
     */
    private Long cartId;

    /**
     * 用户ID
     */
    private Long uid;

    /**
     * 商品
     */
    private List<Commodity> commodities;

    /**
     * 状态 1表示正常，0表示删除
     */
    private Integer status;


}
