package com.example.redis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by zk on 2017/9/12.
 */

@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {

}