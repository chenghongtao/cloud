package com.cht.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacos9001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacos9001.class, args);
    }
}
