package com.chilx.common.res;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chilx
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResApi<T> {

    private String code;

    private String msg;

    private T data;

    public static <T> ResApi<T> ok() {
        return ok(null);
    }

    public static <T> ResApi<T> ok(T data) {
        return new ResApi<>("200", "success", data);
    }

    public static <T> ResApi<T> ok(T data, String msg) {
        return new ResApi<>("200", msg, data);
    }

    public static <T> ResApi<T> fail() {
        return new ResApi<>("500", "服务器异常", null);
    }

    public static <T> ResApi<T> fail(String code, String msg) {
        return new ResApi<>(code, msg, null);
    }

}
