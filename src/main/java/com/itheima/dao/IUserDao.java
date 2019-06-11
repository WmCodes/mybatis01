package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

/**
 * @author wangmeng
 * @date 2019/6/10
 * @desciption
 */
public interface IUserDao {


    List<User> findAll();
}
