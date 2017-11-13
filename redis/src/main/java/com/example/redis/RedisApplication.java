package com.example.redis;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisApplication.class, args);
	}

	@RequestMapping("")
	public String test(HttpServletRequest request){
		request.getSession().setAttribute("bb","dwfrdwe");
		return request.getSession().getAttribute("bb")+"";
	}
}
