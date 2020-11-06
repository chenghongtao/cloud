package com.cht.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacosOrder80 {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacosOrder80.class,args);
    }
}
