package com.bgl.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品类目VO
 * Created by buguoliang on 2018/2/27.
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = -5493379035687634324L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoList;
}
