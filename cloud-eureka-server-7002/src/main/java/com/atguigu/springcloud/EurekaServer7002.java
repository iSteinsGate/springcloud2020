package com.atguigu.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tsinghui
 * @date 2020-08-02 18:57
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer7002 {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(EurekaServer7002.class, args);
    }
}
