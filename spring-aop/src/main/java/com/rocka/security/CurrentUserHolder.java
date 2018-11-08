package com.rocka.security;

/**
 * @author: Rocka
 * @version: 1.0
 * @description: TODO
 * @time:2018/10/29
 */
public class CurrentUserHolder {

    private static ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get(){
        return holder.get() == null ? "error null" : holder.get();
    }

    public static void set(String value){
        holder.set(value);
    }
}
