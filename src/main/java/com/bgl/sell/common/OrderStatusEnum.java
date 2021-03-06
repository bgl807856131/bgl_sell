package com.bgl.sell.common;

import lombok.Getter;

/**
 * 订单状态
 * Created by buguoliang on 2018/3/1.
 */
@Getter
public enum OrderStatusEnum {
    NEW(0, "新订单"),
    FINISHED(1, "已完结"),
    CANCEL(2, "已取消");

    private Integer code;

    private String message;

    OrderStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
