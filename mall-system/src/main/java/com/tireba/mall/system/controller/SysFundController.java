package com.tireba.mall.system.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.tireba.mall.system.constant.ApiStatusEnum;
import com.tireba.mall.system.entity.SysFund;
import com.tireba.mall.system.entity.api.ApiResult;
import com.tireba.mall.system.entity.vo.SysFundVo;
import com.tireba.mall.system.service.ISysFundService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @Description 资金管理表 前端控制器
 * @author tireba
 * @since 2022-04-09
 */
@Slf4j
@RestController
@RequestMapping("sys/fund/")
@Api("资金管理")
public class SysFundController {

    @Autowired
    private ISysFundService sysFundService;

    @PostMapping("queryFlowList")
    @ApiOperation("查询用户资金流动情况")
    public ApiResult<List<SysFundVo>> queryFlowListByUserId(SysFundVo fund) {
        try {
            List<SysFundVo> flowList = sysFundService.queryFlowListByUserId(fund);
            if(CollectionUtils.isEmpty(flowList)) {
               return ApiResult.fail();
            }
            return ApiResult.success(flowList);
        }catch (Exception e) {
            log.error("queryFlowListByUserIdException {}", e);
            return ApiResult.error();
        }
    }

    @PostMapping("insertUserFlowInfo")
    @ApiOperation("添加用户资金流动情况")
    public ApiResult insertUserFlowInfo(SysFundVo fund) {
        try {
            if(!verifyInfo(fund)) {
                return ApiResult.fail(ApiStatusEnum.PARAM_MISTAKE.getCode(), ApiStatusEnum.PARAM_MISTAKE.getMsg());
            }
            int insertRow = sysFundService.insertUserFlowInfo(fund);
        } catch (Exception e) {
            log.error("insertUserFlowInfoException {}", e);
            return ApiResult.error();
        }
        return ApiResult.success();
    }

    public boolean verifyInfo(SysFundVo f) {
        if(f.getType() == null) {
            return false;
        }
        if(f.getUserId() == null) {
            return false;
        }
        if(StringUtils.isEmpty(f.getMoney())) {
            return false;
        }
        return true;
    }

}
