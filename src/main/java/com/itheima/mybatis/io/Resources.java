package com.itheima.mybatis.io;

import java.io.InputStream;

/**
 * @author wangmeng
 * @date 2019/6/11
 * @desciption 使用类加载器读取配置文件
 */
public class Resources {

    /**
     *
     *
     * @author wangmeng
     * @date 2019/6/11 14:38
     * @param [filePath]
     * @return java.io.InputStream
     * @Instructions
     */
    public static InputStream getResourceAsStream(String filePath){
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
