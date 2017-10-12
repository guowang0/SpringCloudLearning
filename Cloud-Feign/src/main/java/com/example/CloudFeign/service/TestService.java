package com.example.CloudFeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zk on 2017/9/29.
 */
@FeignClient(value = "client")
public interface TestService {

    @RequestMapping("/")
    String get();
}
