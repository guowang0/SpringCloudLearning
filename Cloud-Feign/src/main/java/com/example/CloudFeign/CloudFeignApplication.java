package com.example.CloudFeign;

import com.example.CloudFeign.service.TestService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class CloudFeignApplication {

    private final TestService testService;

    public CloudFeignApplication(TestService testService) {
        this.testService = testService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CloudFeignApplication.class, args);
    }

    @RequestMapping("")
    public String test() {
        return "from  " + testService.get();
    }


}
