package com.chilx.order.entity;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.chilx.mybatis.entity.BaseEntity;
import com.chilx.order.enums.OrderStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * @author chilx
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@TableName("o_order")
public class OrderEntity extends BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 订单金额
     */
    private BigDecimal amount;
    /**
     * 订单状态
     */
    @JSONField(serializeFeatures = {JSONWriter.Feature.WriteEnumUsingToString})
    private OrderStatus status;

}