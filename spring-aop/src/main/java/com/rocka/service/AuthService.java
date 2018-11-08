package com.rocka.service;


import com.rocka.security.CurrentUserHolder;

import org.springframework.stereotype.Component;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: TODO
 * @time:2018/10/29
 */
@Component
public class AuthService {

    public void checkAccess() {
        String user = CurrentUserHolder.get();
        if (!user.equals("admin")) {
            throw new RuntimeException("user is null or wrong");
        }
    }
}
