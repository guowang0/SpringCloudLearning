package com.example.CloudClient.controller;

import com.example.CloudClient.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zk on 2017/10/10.
 */
@RestController
@RequestMapping("/rest")
public class RestTestController {

    private final TestService testService;

    public RestTestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test")
    public void test() {
        testService.test();
        testService.sqlTest();
    }

}
