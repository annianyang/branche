package com.example.springmybatis2.service.impl;


import com.example.springmybatis2.entity.TestUser;
import com.example.springmybatis2.mapper.UserMapper;
import com.example.springmybatis2.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service

public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;




    @Override
    public TestUser getUserByid(Long uid) {
        return userMapper.getUserByid(uid);
    }

    @Override
    public int getCount() {
        return userMapper.getCount();
    }
}
