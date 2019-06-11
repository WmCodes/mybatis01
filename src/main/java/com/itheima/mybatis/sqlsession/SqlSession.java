package com.itheima.mybatis.sqlsession;

/**
 * @author wangmeng
 * @date 2019/6/11
 * @desciption mybatis中与数据库交互的核心类
 */
public interface SqlSession {

    <T> T getMapper(Class<T> daoInterfaceClass);

    void close();
}
