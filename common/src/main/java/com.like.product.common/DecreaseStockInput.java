package com.like.product.common;

import lombok.Data;

/**
 * Created by like
 * 2018/6/10
 */
@Data
public class DecreaseStockInput {
    /**
     * 商品ID
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
