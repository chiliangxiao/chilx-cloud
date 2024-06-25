package com.chilx.order.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 订单状态枚举
 * @author chilx
 */

public enum OrderStatus {


    /**
     * 订单刚创建，等待用户支付
     */
    NEW(0, "新订单"),
    /**
     * 用户已提交订单，但尚未完成支付
     */
    UNPAID(1, "待支付"), 
    /**
     * 用户已支付，等待商家确认
     */
    PAID(2, "已支付"),  
    /**
     * 商家已确认，正在准备发货
     */
    PROCESSING(3, "处理中"),  
    /**
     * 订单已发货，等待用户收货
     */
    SHIPPED(4, "已发货"),  
    /**
     * 用户已签收
     */
    DELIVERED(5, "已送达"), 
    /**
     * 订单交易完成
     */
    COMPLETED(6, "已完成"), 
    /**
     * 订单被用户或系统取消
     */
    CANCELED(7, "已取消"), 
    /**
     * 订单已退款
     */
    REFUNDED(8, "已退款"), 
    /**
     * 订单处理过程中出现异常，需要人工介入
     */
    EXCEPTION(9, "异常");
    @EnumValue
//    @JsonValue
    private final int code;
    private final String desc;

    OrderStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    /**
     * 根据code获取枚举值
     */
    public static OrderStatus fromCode(int code) {
        for (OrderStatus status : values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid order status code: " + code);
    }
    }