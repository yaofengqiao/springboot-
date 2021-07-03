package com.hue.service.impl;

import com.hue.entity.Users;
import com.hue.mapper.UsersMapper;
import com.hue.service.UsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 姚凤桥
 * @since 2021-07-03
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

}
