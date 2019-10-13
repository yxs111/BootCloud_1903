package com.qfedu.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *@program: BootCloud_1903
 *@description:
 *@author: Feri
 *@create: 2019-08-07 15:44
 * 注册中心
 */
@SpringBootApplication
@EnableEurekaServer  //标记这是注册中心服务端
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
