package com.sell.common;

import lombok.Getter;

/**
 * Created by buguoliang on 2018/3/8.
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功")
    ;

    private Integer code;

    private String message;

    PayStatusEnum(int code, String message){
        this.code = code;
        this.message = message;
    }
}
