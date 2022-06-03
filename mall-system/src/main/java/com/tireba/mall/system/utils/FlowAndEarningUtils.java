package com.tireba.mall.system.utils;

/**
 * @Description TODO
 * @Date 2022/4/9 20:23
 * @Create by Tireba
 */
public class FlowAndEarningUtils {

    public static String getFlowType(Integer type) {
        String name = "";
        switch (type) {
            case 1 :
                name = "餐饮";
                break;
            case 2 :
                name = "交通";
                break;
            case 3 :
                name = "服饰";
                break;
            case 4 :
                name = "购物";
                break;
            case 5 :
                name = "娱乐";
                break;
            case 6 :
                name = "运动";
                break;
            case 7 :
                name = "生活缴费";
                break;
            case 8 :
                name = "旅行";
                break;
            case 9 :
                name = "话费";
                break;
            case 10 :
                name = "医疗";
                break;
        }
        return name;
    }

    public static String getEarningType(Integer type) {
        String name = "";
        switch (type) {
            case 1 :
                name = "生意";
                break;
            case 2 :
                name = "工资";
                break;
            case 3 :
                name = "奖金";
                break;
            case 4 :
                name = "其他人情";
                break;
            case 5 :
                name = "红包";
                break;
            case 6 :
                name = "收转账";
                break;
            case 7 :
                name = "商家转账";
                break;
        }
        return name;
    }

}
