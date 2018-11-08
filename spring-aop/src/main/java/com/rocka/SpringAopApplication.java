package com.rocka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//强制使用cglib代理
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }
}
