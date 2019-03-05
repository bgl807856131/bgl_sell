package com.sell.dataobject.mapper;

import com.bgl.sell.dataobject.ProductCategory;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by buguoliang on 2018/5/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Test
    public void insertByMap() throws Exception {

        Map<String, Object> map = new HashMap<>();
        map.put("category_name", "丹姐姐最爱");
        map.put("category_type", 9);
        int result = productCategoryMapper.insertByMap(map);
        Assert.assertEquals(1, result);
    }

    @Test
    public void insertByObject() throws Exception {

        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("测试");
        productCategory.setCategoryType(12);
        int result = productCategoryMapper.insertByObject(productCategory);
        Assert.assertEquals(1, result);
    }

    @Test
    public void findByCategoryType() {
        ProductCategory result = productCategoryMapper.findByCategoryType(8);
        log.info("productCategory = {}", result);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryName() {
        List<ProductCategory> result = productCategoryMapper.findByCategoryName("测试");
        Assert.assertEquals(2, result.size());
    }
}