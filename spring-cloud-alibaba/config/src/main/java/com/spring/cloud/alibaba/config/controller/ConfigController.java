package com.spring.cloud.alibaba.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${useLocalCache:false}")
    private boolean useLocalCache;

    @Value("${userconfig}")
    private String userconfig;

    /**
     * http://localhost:8085/config/get
     */
    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }

    /**
     *
     * http://localhost:8085/getUserConfig
     */
    @RequestMapping("/getUserConfig")
    public String getUserconfig(){
        return userconfig;
    }
}