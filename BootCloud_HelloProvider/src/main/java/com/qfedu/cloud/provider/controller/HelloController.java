package com.qfedu.cloud.provider.controller;/**
 * @author Feri
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@program: BootCloud_1903
 *@description:
 *@author: Feri
 *@create: 2019-08-07 15:54
 */
@RestController
public class HelloController {
    @GetMapping("/provider/hello/first.do")
    public String first(){
        System.out.println("提供者："+System.currentTimeMillis());
        return "七夕";
    }
}
