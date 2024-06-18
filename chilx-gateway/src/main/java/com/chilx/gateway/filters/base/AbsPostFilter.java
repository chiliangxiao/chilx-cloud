package com.chilx.gateway.filters.base;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 后置处理
 *
 * @author chilx
 **/
public abstract class AbsPostFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        return chain.filter(exchange).then(Mono.fromRunnable(() -> doPost(exchange, chain)));
    }


    /**
     * 抽象后置处理方法
     *
     * @param exchange the current server exchange
     * @param chain    provides a way to delegate to the next filter
     */
    public abstract void doPost(ServerWebExchange exchange, GatewayFilterChain chain);

    /**
     * 优先级, 数据越大优先级越高, 就先执行
     * (和pre相反)
     */
    @Override
    public int getOrder() {
        return 1;
    }
}
