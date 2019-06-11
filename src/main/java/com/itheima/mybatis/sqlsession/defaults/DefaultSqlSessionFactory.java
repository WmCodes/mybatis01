package com.itheima.mybatis.sqlsession.defaults;

import com.itheima.mybatis.cfg.Configuration;
import com.itheima.mybatis.sqlsession.SqlSession;
import com.itheima.mybatis.sqlsession.SqlSessionFactory;

/**
 * @author wangmeng
 * @date 2019/6/11
 * @desciption
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration cfg ;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
