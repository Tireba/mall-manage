package com.tireba.mall.system.entity;

import lombok.Data;

import java.util.Date;

/**
 * @Description 实体类基类
 * @Date 2022/4/9 14:56
 * @Create by Tireba
 */
@Data
public class BaseEntity {

    private Date createTime;

    private Date updateTime;
}
