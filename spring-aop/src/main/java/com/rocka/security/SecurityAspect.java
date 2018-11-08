package com.rocka.security;


import com.rocka.service.AuthService;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: TODO
 * @time:2018/10/30
 */
//切面
@Aspect
@Component
public class SecurityAspect {

    @Autowired
    AuthService authService;

    //参数表达式，想切哪些东西，拦截标注有AdminOnly的注解
    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly(){
        System.out.println("check start");
    }

    @Pointcut("execution(public * com.rocka.service.*Service.*(..))")
    public void match(){

    }

    //在执行之前，执行一段共有逻辑
    @Before("adminOnly()")
    public void check(){
        System.out.println("adminOnly annotation check before");
        authService.checkAccess();
    }

}
