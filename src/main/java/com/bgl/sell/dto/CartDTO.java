package com.bgl.sell.dto;

import lombok.Data;

/**
 * Created by buguoliang on 2018/3/27.
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
