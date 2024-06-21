package com.chilx.user.config;

import com.alibaba.fastjson2.JSON;
import com.chilx.common.res.ResApi;
import feign.FeignException;
import feign.Response;
import feign.Util;
import feign.codec.DecodeException;
import feign.codec.Decoder;

import java.io.IOException;
import java.lang.reflect.Type;

/**
 * @author chilx
 */
public class OpenfeignResultDecoderConfig implements Decoder {
    @Override
    public Object decode(Response response, Type type) throws IOException, DecodeException, FeignException {
        if (response.body() == null) {
            throw new DecodeException(response.status(), "没有返回有效的数据", response.request());
        }
        String bodyStr = Util.toString(response.body().asReader(Util.UTF_8));
        //对结果进行转换
        ResApi<?> result = JSON.parseObject(bodyStr, ResApi.class);
        //如果返回错误，且为内部错误，则直接抛出异常
        if (!result.success()) {
            throw new DecodeException(response.status(), "接口返回错误：" + result.getMsg(), response.request());
        }
        return result.getData();
    }
}
