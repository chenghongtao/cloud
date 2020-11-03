package com.cht.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Erueka7001 {
    public static void main(String[] args) {
        SpringApplication.run(Erueka7001.class,args);
    }
}
