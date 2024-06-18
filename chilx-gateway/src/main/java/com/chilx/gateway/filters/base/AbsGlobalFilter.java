package com.chilx.gateway.filters.base;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 来接处理基类
 *
 * @author chilx
 **/
public abstract class AbsGlobalFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return chain.filter(doPre(exchange, chain)).then(Mono.fromRunnable(() -> doPost(exchange, chain)));
    }


    /**
     * 抽象前置处理方法
     *
     * @param exchange the current server exchange
     */
    public abstract ServerWebExchange doPre(ServerWebExchange exchange, GatewayFilterChain chain);

    /**
     * 抽象后置处理方法
     *
     * @param exchange the current server exchange
     */
    public abstract void doPost(ServerWebExchange exchange, GatewayFilterChain chain);

    /**
     * 优先级, 数据越小优先级越高, 就先执行
     * (和post相反)
     */
    @Override
    public int getOrder() {
        return 9999;
    }
}
