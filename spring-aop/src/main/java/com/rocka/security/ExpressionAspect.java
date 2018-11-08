package com.rocka.security;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: 注解表达式
 * @time:2018/11/7
 */
@Aspect
@Component
public class ExpressionAspect {

    @Pointcut("within(com.rocka.service.ProductService)")
    public void withinExpression(){
        System.out.println("within expression Pointcut");
    }

    @Before("withinExpression()")
    public void before(){
        System.out.println("");
        System.out.println("within expression before");
    }
}