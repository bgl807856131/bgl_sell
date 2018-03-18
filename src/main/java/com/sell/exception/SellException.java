package com.sell.exception;

import com.sell.common.ResultEnum;

/**
 * Created by buguoliang on 2018/3/11.
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        
        this.code = resultEnum.getCode();
    }
}
