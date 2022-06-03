package com.tireba.mall.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tireba.mall.system.entity.SysFund;
import com.tireba.mall.system.entity.vo.SysFundVo;
import com.tireba.mall.system.mapper.SysFundMapper;
import com.tireba.mall.system.service.ISysFundService;
import com.tireba.mall.system.utils.FlowAndEarningUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Desc 资金管理表 服务实现类
 * @author tireba
 * @since 2022-04-09
 */
@Service
public class SysFundServiceImpl extends ServiceImpl<SysFundMapper, SysFund> implements ISysFundService {

    @Autowired
    private SysFundMapper sysFundMapper;

    @Override
    public List<SysFundVo> queryFlowListByUserId(SysFundVo fund) {
        List<SysFundVo> fundVoList = sysFundMapper.queryFlowListByUserId(fund);
        /*if(!CollectionUtils.isEmpty(fundVoList)) {
            fundVoList.forEach(p -> {
                if(p.getType() == 0) {
                    p.setDescription(FlowAndEarningUtils.getFlowType(p.getFlowType()));
                }else {
                    p.setDescription(FlowAndEarningUtils.getEarningType(p.getEarningType()));
                }
            });
        }*/
        return fundVoList;
    }

    @Override
    public int insertUserFlowInfo(SysFundVo fund) {
        SysFund sysFund = new SysFund();
        BeanUtils.copyProperties(fund, sysFund);
        sysFund.setCreateTime(new Date());
        sysFund.setUpdateTime(new Date());
        int insertRow = sysFundMapper.insert(sysFund);
        return insertRow;
    }
}
