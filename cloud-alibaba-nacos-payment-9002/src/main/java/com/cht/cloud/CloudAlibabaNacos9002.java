package com.cht.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaNacos9002 {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacos9002.class, args);
    }
}
