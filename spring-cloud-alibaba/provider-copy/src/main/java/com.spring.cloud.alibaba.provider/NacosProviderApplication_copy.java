package com.alibaba.nacos.example.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaojing
 */
@SpringBootApplication
public class NacosProviderApplication_copy {

	public static void main(String[] args) {
		SpringApplication.run(NacosProviderApplication_copy.class, args);
	}

	@RestController
	class EchoController {
		@RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
		public String echo(@PathVariable String string) {
			return "Hello Nacos Discovery " + string;
		}

		@GetMapping("/call")
		public String callTest(){
			return  "我是服务提供者2，我被访问到了";
		}
	}
}
