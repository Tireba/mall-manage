package com.tireba.mall.system.entity.vo;

import lombok.*;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @Date 2022/4/9 16:01
 * @Create by Tireba
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Builder
@ToString
public class SysFundVo {

    private Integer id;

    private Integer userId;

    private String userName;

    /**
     * 类型：0-支出，1-收入
     */
    private Integer type;

    /**
     * 金额
     */
    private String money;

    /**
     * 单位
     */
    private String unit;

    /**
     * 支出类型
     */
    private Integer flowType;

    /**
     * 收入类型
     */
    private Integer earningType;

    /**
     * 描述
     */
    private String description;

    /**
     * 备注
     */
    private String remark;
}
