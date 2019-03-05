package com.bgl.sell.service;

import com.bgl.sell.dataobject.ProductInfo;
import com.bgl.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by buguoliang on 2018/2/1.
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询上架的所有商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList);

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
