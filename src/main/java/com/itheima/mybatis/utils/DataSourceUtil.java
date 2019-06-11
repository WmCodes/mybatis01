package com.itheima.mybatis.utils;

import com.itheima.mybatis.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author wangmeng
 * @date 2019/6/11
 * @desciption
 */
public class DataSourceUtil {

    public static Connection getConnection(Configuration cfg){

        try {
            Class.forName(cfg.getDriver());
            return DriverManager.getConnection(cfg.getUrl(),cfg.getUsername(),cfg.getPassword());
        } catch (Exception e) {
           throw new RuntimeException(e);
        }
    }
}
