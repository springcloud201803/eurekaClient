package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * eureka 服务注册中心    客户端
 * @author pain
 *
 */
@EnableEurekaClient
@RestController
@SpringBootApplication
public class EurekaClientApplication {

	@Value("${server.port}")
    String port;
	@RequestMapping("getStr")
	public String getStr(@RequestParam String name) {
		return "this is name="+name+"port="+port;
	}
	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}
}
