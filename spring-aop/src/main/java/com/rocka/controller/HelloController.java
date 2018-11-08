package com.rocka.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: TODO
 * @time:2018/10/29
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "parent.html")
public class HelloController {

    @RequestMapping(value = "acdc")
    public String hello(){
        return "hello ,this is a ACDC demo";
    }
}
