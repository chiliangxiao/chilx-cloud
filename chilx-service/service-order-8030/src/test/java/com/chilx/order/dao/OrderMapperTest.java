package com.chilx.order.dao;

import cn.hutool.core.lang.UUID;
import com.chilx.order.entity.OrderEntity;
import com.chilx.order.enums.OrderStatus;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest
class OrderMapperTest {


    @Resource
    private OrderMapper orderMapper;

    @Test
    void name() {

        OrderEntity order = orderMapper.selectById(1L);
        System.out.println();
        OrderEntity build = OrderEntity.builder()
                .amount(BigDecimal.valueOf(100))
                .orderCode(UUID.fastUUID().toString(true))
                .status(OrderStatus.NEW)
                .del(Boolean.FALSE)
                .version(1)
                .createUser(1L)
                .updateUser(1L)
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();

        int insert = orderMapper.insert(build);

        System.out.println();
    }
}