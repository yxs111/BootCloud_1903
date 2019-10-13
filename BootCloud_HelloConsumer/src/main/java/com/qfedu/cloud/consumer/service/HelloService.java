package com.qfedu.cloud.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Feri
 * 基于Feign服务消费
 */
@FeignClient("HelloProvider")
public interface HelloService {
    @GetMapping("/provider/hello/first.do")
    String hello();
}
