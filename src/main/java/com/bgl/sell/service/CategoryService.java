package com.bgl.sell.service;

import com.bgl.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by buguoliang on 2018/1/30.
 */
public interface CategoryService {

    ProductCategory findOne(Integer id);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
