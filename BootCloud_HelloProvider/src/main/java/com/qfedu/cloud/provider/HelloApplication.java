package com.qfedu.cloud.provider;/**
 * @author Feri
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *@program: BootCloud_1903
 *@description:
 *@author: Feri
 *@create: 2019-08-07 15:53
 */
@SpringBootApplication
@EnableDiscoveryClient //注册服务
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
