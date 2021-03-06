package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author tsinghui
 * @date 2020-07-31 21:41
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //ribbon的负载均衡(轮询)
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
