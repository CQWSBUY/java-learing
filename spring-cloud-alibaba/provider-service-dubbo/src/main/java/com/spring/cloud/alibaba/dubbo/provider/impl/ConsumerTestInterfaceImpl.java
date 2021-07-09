package com.spring.cloud.alibaba.dubbo.provider.impl;


import com.consumer.service.api.IConsumerTestInterface;
import org.apache.dubbo.config.annotation.Service;


/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/6/14 19:58
 */
@Service
public class ConsumerTestInterfaceImpl implements IConsumerTestInterface {

    @Override
    public String callService() {
        return "我是provider的实现类，我被调用了!";
    }
}
