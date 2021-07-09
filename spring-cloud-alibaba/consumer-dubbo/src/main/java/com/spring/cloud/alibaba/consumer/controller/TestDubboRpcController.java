package com.spring.cloud.alibaba.consumer.controller;


import com.consumer.service.api.IConsumerTestInterface;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 * @version 1.0
 * @description: TODO
 * @date 2021/6/14 20:22
 */
@RestController
@RequestMapping("/rpc")
public class TestDubboRpcController {

    @Reference
    private IConsumerTestInterface consumerTestInterface;

    /**
     *http://127.0.0.1:8087/rpc/testPrvider
     * @return
     */
    @GetMapping("/testPrvider")
    public String TestPrvider(){
        return consumerTestInterface.callService();
    }
}
