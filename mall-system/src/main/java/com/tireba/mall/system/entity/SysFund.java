package com.tireba.mall.system.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * @Description 资金管理表
 * @author tireba
 * @since 2022-04-09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Builder
@ToString
@TableName("sys_fund")
public class SysFund extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer userId;

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
     * 备注
     */
    private String remark;

}
