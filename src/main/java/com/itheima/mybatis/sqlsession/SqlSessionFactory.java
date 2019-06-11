package com.itheima.mybatis.sqlsession;

/**
 * @author wangmeng
 * @date 2019/6/11
 * @desciption
 */
public interface SqlSessionFactory {

    SqlSession openSession();
}
