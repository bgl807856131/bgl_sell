package com.bgl.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by BGL on 2018/1/26.
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory{
    /**类目ID*/
    @Id
    @GeneratedValue
    private Integer categoryId;

    /**类目名*/
    private String categoryName;

    /**类目类型*/
    private Integer categoryType;
//    /**创建时间*/
//    private Timestamp createTime;
//    /**更新时间*/
//    private Timestamp updateTime;

    public ProductCategory(){}

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
