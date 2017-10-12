package com.example.CloudClient1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class CloudClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(CloudClient1Application.class, args);
	}

	@RequestMapping("")
	public String test() {
		return "2";
	}
}
