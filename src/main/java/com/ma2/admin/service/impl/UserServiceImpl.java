package com.ma2.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ma2.admin.bean.User;
import com.ma2.admin.mapper.UserMapper;
import com.ma2.admin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
