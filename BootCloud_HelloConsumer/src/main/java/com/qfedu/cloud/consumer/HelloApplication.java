package com.qfedu.cloud.consumer;/**
 * @author Feri
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *@program: BootCloud_1903
 *@description:
 *@author: Feri
 *@create: 2019-08-07 16:03
 */
@SpringBootApplication
@EnableDiscoveryClient  //注册并发现服务
@EnableFeignClients //启用Feign 进行服务消费
@EnableSwagger2
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
