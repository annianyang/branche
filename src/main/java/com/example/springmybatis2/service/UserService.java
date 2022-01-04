package com.example.springmybatis2.service;

import com.example.springmybatis2.entity.TestUser;
import org.apache.ibatis.annotations.Param;


public interface UserService {

    public TestUser getUserByid(@Param("uid") Long uid);

    public int getCount();
}
