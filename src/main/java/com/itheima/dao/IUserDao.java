package com.itheima.dao;

import com.itheima.domain.User;
import com.itheima.mybatis.annotation.Select;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/6/10
 * @desciption
 */
public interface IUserDao {


    @Select("select * from user")
    List<User> findAll();
}
