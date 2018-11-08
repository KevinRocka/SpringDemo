package com.rocka.service;


import com.rocka.security.AdminOnly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: TODO
 * @time:2018/10/29
 */
@Service
public class ProductService {

    @Autowired
    AuthService authService;

    /**
     * 自带的权限检查逻辑
     * @param id
     */
    public void insertWithOnlyCheck(long id){
        authService.checkAccess();
        System.out.println("ProductService insert --- " + id);
    }

    /**
     * 自带的权限检查逻辑
     * @param id
     */
    public void deleteWithOnlyCheck(long id){
        authService.checkAccess();
        System.out.println("ProductService delete --- " + id);
    }


    /**
     * 仅仅insert
     *~
     * @param id
     */
    @AdminOnly
    public void insert(long id){
        System.out.println("ProductService only insert --- " + id);
    }

    /**
     * 仅仅delete
     *
     * @param id
     */
    @AdminOnly
    public void delete(long id){
        System.out.println("ProductService only delete --- " + id);
    }
}
