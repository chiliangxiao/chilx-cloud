package com.chilx.order.controller;

import com.chilx.common.res.ResApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author chilx
 **/
@RestController
@RequestMapping
public class OrderController {

    @GetMapping("/getOrderById")
    public ResApi<String> info(String id) {
        return ResApi.ok("订单id为 " + id);
    }

    @GetMapping("/getOrderListByUserId")
    public ResApi<List<String>> orderList(Long userId) {
        return ResApi.ok(Arrays.asList("订单1", "订单2", "订单3"));
    }
}
