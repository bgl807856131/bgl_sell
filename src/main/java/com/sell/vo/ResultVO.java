package com.sell.vo;

import lombok.Data;

/**
 * Created by buguoliang on 2018/2/27.
 */
@Data
public class ResultVO<T> {

    /**状态码*/
    private Integer code;

    /**提示信息*/
    private String msg;

    /**具体内容*/
    private T data;
}
