package com.spring.cloud.alibaba.consumer;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaojing
 */
@SpringBootApplication
public class NacosConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApplication.class, args);
    }

    @Service
    public class TestService {

        @SentinelResource(value = "sayHello")
        public String sayHello(String name) {
            return "Hello, " + name;
        }
    }

    @RestController
    public class TestController {

        @Autowired
        private TestService service;

        @GetMapping(value = "/hello/{name}")
        public String apiHello(@PathVariable String name) {
            return service.sayHello(name);
        }
    }
}
