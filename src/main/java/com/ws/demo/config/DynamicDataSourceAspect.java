package com.ws.demo.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @Author: ws
 * @Description:
 * @Date: 2022/4/26 18:03
 */
@Component
@Aspect
@Order(1)
public class DynamicDataSourceAspect {

    Logger logger = LoggerFactory.getLogger(DynamicDataSourceAspect.class);

    @Around(value = "@annotation(com.ws.demo.config.DataSource)")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        String dsKey = getDSAnnotation(joinPoint).value();
        DynamicDataSourceContextHolder.setDBKey(dsKey);
        logger.debug(String.format("current db 【%s】",dsKey));
        try{
            return joinPoint.proceed();
        }finally {
            DynamicDataSourceContextHolder.removeDBKey();
        }
    }

    /**
     * 根据类或方法获取数据源注解
     */
    private DataSource getDSAnnotation(ProceedingJoinPoint joinPoint) throws NoSuchMethodException {

        // 增强类
        Class<?> targetClass = joinPoint.getTarget().getClass();
        DataSource dataSourceAnnotation = targetClass.getAnnotation(DataSource.class);
        // 先判断类的注解，再判断方法注解
        if(Objects.nonNull(dataSourceAnnotation)){
            return dataSourceAnnotation;
        }

        // 增强类方法
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        DataSource enhanceDataSource = methodSignature.getMethod().getAnnotation(DataSource.class);
        if(Objects.nonNull(enhanceDataSource)){
            return enhanceDataSource;
        }

        // 原始类
        Method method = methodSignature.getMethod();
        Method realMethod = joinPoint.getTarget().getClass().getDeclaredMethod(methodSignature.getName(), method.getParameterTypes());
        DataSource dataSource = realMethod.getAnnotation(DataSource.class);
        return dataSource;
    }
}
