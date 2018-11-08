package com.rocka.service;

import com.rocka.dao.Home;

import org.springframework.stereotype.Service;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: TODO
 * @time:2018/11/5
 */
@Service
public class HomeServiceImpl implements HomeService{

    @Override
    public Home getHomeById(int id) {
        Home home = new Home();
        home.setId(id);
        home.setContent("这是一个Home的内容文本哦");
        home.setName("Home名称哦");
        home.setTitle("这是一个Home标题哦");
        return home;
    }
}
