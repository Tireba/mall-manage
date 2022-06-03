package com.tireba.mall.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tireba.mall.system.entity.SysFund;
import com.tireba.mall.system.entity.vo.SysFundVo;

import java.util.List;

/**
 * <p>
 * 资金管理表 服务类
 * </p>
 *
 * @author tireba
 * @since 2022-04-09
 */
public interface ISysFundService extends IService<SysFund> {

    /**
     * 查询用户资金信息
     * @param fund
     * @return
     */
    List<SysFundVo> queryFlowListByUserId(SysFundVo fund);

    /**
     * 添加用户流动资金情况
     * @param fund
     * @return
     */
    int insertUserFlowInfo(SysFundVo fund);
}
