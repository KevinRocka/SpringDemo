package com.rocka.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: TODO
 * @time:2018/11/7
 */
public class TestInterceptor implements HandlerInterceptor{

    //object handler表示被拦截请求的目标

    //返回true->请求被继续
    //返回false->请求被终止
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return false;
    }


    //可以通过ModelAndView来改变显示的视图，或者修改发往视图的方法
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        modelAndView.addObject("name","test");
//        modelAndView.setViewName("/success.jsp");
    }

    //可以做资源销毁等操作
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
