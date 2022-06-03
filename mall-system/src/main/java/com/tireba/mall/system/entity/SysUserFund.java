package com.tireba.mall.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户资金关联表
 * </p>
 *
 * @author tireba
 * @since 2022-04-09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Builder
@ToString
@TableName("sys_user_fund")
public class SysUserFund extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private Integer userId;

    private Integer fundId;


}
