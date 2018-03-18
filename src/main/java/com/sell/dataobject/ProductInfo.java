package com.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by BGL on 2018/1/31.
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;

    /**产品名称*/
    private String productName;

    /**产品价格*/
    private BigDecimal productPrice;

    /**产品库存*/
    private Integer productStock;

    /**产品描述*/
    private String productDescription;

    /**产品小图*/
    private String productIcon;

    /**产品名称 0 在售，1 下架*/
    private Integer productStatus;

    /**类目编号*/
    private Integer categoryType;

    public ProductInfo() {
    }
}
