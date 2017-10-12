package com.example.CloudClient.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by zk on 2017/9/12.
 */

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 1800)
public class HttpSessionConfig {

}