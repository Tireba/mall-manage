package com.tireba.mall.system.entity.api;

import com.tireba.mall.system.constant.ApiStatusEnum;
import lombok.Data;

/**
 * @Description api返回值
 * @Date 2022/4/9 16:04
 * @Create by Tireba
 */
@Data
public class ApiResult<T> {

    /**
     * 返回状态码
     */
    private Integer code;

    /**
     * 返回值消息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;

    public ApiResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public ApiResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static ApiResult success() {
        return new ApiResult(ApiStatusEnum.SUCCESS.getCode(), ApiStatusEnum.SUCCESS.getMsg());
    }

    public static ApiResult success(Object data) {
        return new ApiResult(ApiStatusEnum.SUCCESS.getCode(), ApiStatusEnum.SUCCESS.getMsg(), data);
    }

    public static ApiResult fail() {
        return new ApiResult(ApiStatusEnum.FAIL.getCode(), ApiStatusEnum.FAIL.getMsg());
    }

    public static ApiResult fail(Integer code, String msg) {
        return new ApiResult(code, msg);
    }

    public ApiResult fail(Integer code, String msg, T data) {
        return new ApiResult(code, msg, data);
    }

    public static ApiResult error() {
        return new ApiResult(ApiStatusEnum.ERROR.getCode(), ApiStatusEnum.ERROR.getMsg());
    }
}
