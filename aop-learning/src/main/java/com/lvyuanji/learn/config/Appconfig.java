package com.lvyuanji.learn.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lvyuanji.learn.*")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Appconfig {
}
