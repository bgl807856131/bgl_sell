package com.sell.repository;

import com.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Bgl on 2018/1/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void saveTest2(){
        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryType(40);
        repository.save(productCategory);
    }

    @Test
//    @Transactional
    @Transactional
    public void saveTest3(){
        ProductCategory productCategory = new ProductCategory("女生最爱", 4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByCategoryTypeInTest3(){
        List<Integer> list = Arrays.asList(11,22,33,4);
        List<ProductCategory> productCategories = repository.findByCategoryTypeIn(list);
        for(ProductCategory category : productCategories) {
            System.out.println(category);
        }
    }
}