package com.example.springmybatis2.mapper;


import com.example.springmybatis2.entity.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    public TestUser getUserByid(@Param("uid") Long uid);

    public int getCount();
}
