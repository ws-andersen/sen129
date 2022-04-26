package com.ws.demo.config;

import com.ws.demo.constant.DBNameType;

import java.util.Objects;

public class DynamicDataSourceContextHolder {

    private static final ThreadLocal<String> DSHolder = new ThreadLocal<>();

    public static void setDBKey(String key){
        DSHolder.set(key);
    }

    public static String getDBKey(){
        String key = DSHolder.get();
        return Objects.isNull(key)? DBNameType.chake:key;
    }

    public static void removeDBKey(){
        DSHolder.remove();
    }
}
