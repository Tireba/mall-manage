package com.tireba.mall.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tireba.mall.system.entity.SysFund;
import com.tireba.mall.system.entity.vo.SysFundVo;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @Description 资金管理表 Mapper 接口
 * @author tireba
 * @since 2022-04-09
 */
@Mapper
public interface SysFundMapper extends BaseMapper<SysFund> {

    List<SysFundVo> queryFlowListByUserId(SysFundVo fund);

    int insertUserFlowInfo(SysFund sysFund);
}
