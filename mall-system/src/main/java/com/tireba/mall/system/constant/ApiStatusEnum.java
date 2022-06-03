package com.tireba.mall.system.constant;

import lombok.Data;
import lombok.Getter;

/**
 * @Description 接口状态枚举值
 * @Date 2022/4/9 16:09
 * @Create by Tireba
 */
@Getter
public enum ApiStatusEnum {
    /** 操作成功 */
    SUCCESS(200, "success"),
    /** 系统异常 */
    ERROR(-1, "error"),
    /** 其他异常 */
    FAIL(400, "fail"),

    PARAM_MISTAKE(9999, "参数有误！"),
    ADD_FAIL(500, "新增失败！"),
    DELETE_FAIL(500, "删除失败！"),
    UPDATE_FAIL(500, "修改失败！"),
    QUERY_FAIL(404, "很抱歉，未查询到数据！");



    private Integer code;
    private String msg;

    ApiStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
