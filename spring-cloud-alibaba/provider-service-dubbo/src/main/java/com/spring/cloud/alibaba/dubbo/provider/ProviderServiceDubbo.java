package com.spring.cloud.alibaba.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author xiaojing
 */
@SpringBootApplication
@RefreshScope
public class ProviderServiceDubbo {
	public static void main(String[] args) {
		SpringApplication.run(ProviderServiceDubbo.class, args);
	}
}
