package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestLinener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("我監聽到了");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
