package com.bgl.sell.controller;

import com.bgl.sell.dto.OrderDTO;
import com.bgl.sell.form.OrderForm;
import com.bgl.sell.common.ResultEnum;
import com.bgl.sell.converter.OrderForm2OrderDTOConverter;
import com.bgl.sell.exception.SellException;
import com.bgl.sell.service.OrderService;
import com.bgl.sell.util.ResultVOUtil;
import com.bgl.sell.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by buguoliang on 2018/4/7.
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    @Autowired
    private OrderService orderService;

    //创建订单
    @PostMapping("/create")
    public ResultVO<Map<String, String>> create(@Valid OrderForm orderForm,
                                                BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("【创建订单】参数错误， orderForm = {}", orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.converter(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())) {
            log.error("【创建订单】购物车为空");
            throw new SellException(ResultEnum.CART_EMPTY);
        }
        OrderDTO OrderResult = orderService.create(orderDTO);

        Map<String, String>  result = new HashMap<>();
        result.put("orderId", OrderResult.getOrderId());

        return ResultVOUtil.success(result);
    }

    //订单列表

    //订单详情

    //取消订单
}
