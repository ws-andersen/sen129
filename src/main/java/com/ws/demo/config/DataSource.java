package com.ws.demo.config;

import com.ws.demo.constant.DBNameType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: ws
 * @Description: 动态切换数据源
 * @Date: 2022/4/26 18:03
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {

    // 数据源名称
    String value() default DBNameType.chake;

}

