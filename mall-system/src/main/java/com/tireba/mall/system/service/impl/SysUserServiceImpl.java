package com.tireba.mall.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tireba.mall.system.entity.SysUser;
import com.tireba.mall.system.mapper.SysUserMapper;
import com.tireba.mall.system.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户表 服务实现类
 * </p>
 *
 * @author tireba
 * @since 2022-04-09
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
