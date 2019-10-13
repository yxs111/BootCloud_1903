package com.qfedu.cloud.consumer.controller;/**
 * @author Feri
 */

import com.qfedu.cloud.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: BootCloud_1903
 *@description:
 *@author: Feri
 *@create: 2019-08-07 16:11
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping("/api/hello/first.do")
    public String hello(){
        return helloService.hello();
    }
}
